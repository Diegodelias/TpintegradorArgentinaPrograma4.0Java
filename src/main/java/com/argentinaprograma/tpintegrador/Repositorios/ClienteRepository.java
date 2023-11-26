/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Repositorios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;

import static com.argentinaprograma.tpintegrador.TpIntegrador.getEntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Windows 10
 */
public class ClienteRepository {

    ServicioRepository servicioRepository = new ServicioRepository();

    EntityManager em = getEntityManager();

    public void crearCliente(Cliente cliente) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(cliente);
        tx.commit();

    }

    public List<Cliente> TodosLosClientes() {

        return em.createQuery("select c from Cliente c", Cliente.class).getResultList();
    }

    /*   public List<Cliente> seleccionarClientePorDni(String dni) {
        String query = "SELECT c FROM Cliente c WHERE c.dni = :dni";

        List<Cliente> clientes = em.createQuery(query, Cliente.class).setParameter("dni", dni).getResultList();

        if (!clientes.isEmpty()) {

            Cliente cliente = clientes.get(0);

            System.out.println("Cliente encontrado: " + cliente.getNombre() + " - " + cliente.getApellido() + " - " + cliente.getDni());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        return clientes;

    }
     */
    public List<Cliente> seleccionarClientePorDni(String dni) {

        EntityTransaction transaction = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            transaction = em.getTransaction();
            transaction.begin();

            String query = "SELECT c FROM Cliente c WHERE c.dni = :dni";
            clientes = em.createQuery(query, Cliente.class)
                    .setParameter("dni", dni)
                    .getResultList();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
         
        } finally {
            if (em != null) {
              // em.close();
            }
        }

        if (!clientes.isEmpty()) {
            Cliente cliente = clientes.get(0);
            System.out.println("Cliente encontrado: " + cliente.getNombre() + " - " + cliente.getApellido() + " - " + cliente.getDni());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        return clientes;
    }

    public void actualizarCliente(Cliente cliente) {

        try {
            em.getTransaction().begin();

            em.merge(cliente);

            em.getTransaction().commit();
            System.out.println("Cliente actualizado correctamente.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
          //  em.close();
        }

    }

    public void serviciosContradosPorCliente(String razonSocial, String Cuit) {

        //obtener cliente que tenga razonsocial string cuit igual a los pasados por parametro
        //guardar cliente
        Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.razonSocial = :razonSocial AND c.CUIT = :cuit");
        query.setParameter("razonSocial", razonSocial);
        query.setParameter("cuit", Cuit);

        List<Cliente> clientes = query.getResultList();

        clientes.forEach(cliente -> {
            List<Servicio> servicios = cliente.getServicios();
           

            servicios.forEach(servicio -> {
                System.out.println("Servicio ID: " + servicio.getId());
                System.out.println("Categoria: " + servicio.getCategoria());
                System.out.println("Descripcion: " + servicio.getDescripcion());
                System.out.println("Puntaje dificultad " + servicio.getComplejidadPuntaje());

            });
        });
        /*clientes.forEach(cliente -> {
          
            servicioRepository.encontrarServicioPorClienteId(cliente.getId());

        });*/
        /**
         * List<Servicio> servicios = clientes.stream() .map(cliente ->
         * servicioRepository.encontrarServicioPorClienteId(cliente.getId()))
         * .flatMap(List::stream) .collect(Collectors.toList());
         *
         * servicios.forEach(servicio -> { System.out.println("Servicio ID: " +
         * servicio.getId()); System.out.println("Categoria: " +
         * servicio.getCategoria()); System.out.println("Descripcion: " +
         * servicio.getDescripcion());
         *
         * });
         */
    }

}
