/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Repositorios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import static com.argentinaprograma.tpintegrador.TpIntegrador.getEntityManager;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author Windows 10
 */
public class TecnicoRepository {

    EntityManager em = getEntityManager();

    EspecialidadRepository especialidaRepository = new EspecialidadRepository();

    public void crearTecnico(Tecnico tecnico) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(tecnico);
        tx.commit();

    }

    public List<Tecnico> TodosLosTecnicos() {

        return em.createQuery("select t from Tecnico t", Tecnico.class).getResultList();
        //return em.createQuery("SELECT t FROM Tecnico t JOIN FETCH t.especialidades", Tecnico.class).getResultList();
    }

    public void TodosLosTecnicosEspecialidades() {
        String jpql = "SELECT t, e FROM Tecnico t LEFT JOIN t.especialidades e";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);

        List<Object[]> resultados = query.getResultList();

        for (Object[] resultado : resultados) {
            Tecnico tecnico = (Tecnico) resultado[0];
            Especialidad especialidad = (Especialidad) resultado[1];

            System.out.println("Tecnico: " + tecnico.getNombre() + " " + tecnico.getApellido());
            if (especialidad != null) {
                System.out.println("Especialidad: " + especialidad.getNombre()); // Mostrar otros detalles de la especialidad si es necesario
            } else {
                System.out.println("No tiene especialidades asociadas.");
            }
            System.out.println("--------------------");
        }

    }

    public void asignarEspecialidadTecnico() {
        Scanner scanner = new Scanner(System.in);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //listar tecnicos
        List<Tecnico> listaTecnicos = TodosLosTecnicos();

        System.out.println("Seleccionar tecnico (ingresar numero id)");
        listaTecnicos.stream()
                .map(t -> "id:" + t.getId() + " " + t.getNombre() + " " + t.getApellido())
                .forEach(System.out::println);

        long TecnicoIdBuscar = scanner.nextLong();
        //traer ese tecnico
        Tecnico TecnicoSeleccionado = em.find(Tecnico.class, TecnicoIdBuscar);

        //listar especialidades 
        List<Especialidad> especialidades = especialidaRepository.listarEspecialidades();
        System.out.println("Seleccionar especialidad (ingresar numero id)");

        especialidades.forEach(especialidad -> System.out.println("ID: " + especialidad.getId() + ", Nombre: " + especialidad.getNombre()));

        long EspecialidadIdBuscar = scanner.nextLong();
        //segun especilidad seleccionada ingresar encontrar esa especialidad
        Especialidad EspecialidadSeleccionada = em.find(Especialidad.class, EspecialidadIdBuscar);

        // TecnicoSeleccionado.getEspecialidades().add(EspecialidadSeleccionada);
        //EspecialidadSeleccionada.getTecnicos().add(TecnicoSeleccionado);
        //  TecnicoSeleccionado.agregarHabilidad(EspecialidadSeleccionada);
        //  em.merge(TecnicoSeleccionado);
        TecnicoSeleccionado.getEspecialidades().add(EspecialidadSeleccionada);

        em.merge(TecnicoSeleccionado);
        // em.persist(EspecialidadSeleccionada);

        tx.commit();

    }

}
