/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Repositorios;

import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import static com.argentinaprograma.tpintegrador.TpIntegrador.getEntityManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Windows 10
 */
public class ServicioRepository {

    EntityManager em = getEntityManager();

    public void crearServicio(Servicio servicio) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(servicio);
        tx.commit();

    }

    public List<Servicio> encontrarServicioPorServId(Long servId) {

        /*  Query query = em.createQuery("SELECT s FROM Servicio s WHERE s.cliente.id = :clienteId");
        query.setParameter("clienteId", clienteId);

        return query.getResultList();*/
    

        /* String servicioQuery = "SELECT s FROM Servicio s WHERE s.cliente.id = :clienteId";
        List<Servicio> servicios = em.createQuery(servicioQuery, Servicio.class)
                .setParameter("clienteId", clienteId)
                .getResultList();*/
        TypedQuery<Servicio> query = em.createQuery(
                "SELECT s FROM Servicio s WHERE s.id = :servicioId", Servicio.class);
        query.setParameter("servicioId", servId);
        List<Servicio> servicios = query.getResultList();

        return servicios;

    }

    public List<Servicio> buscarServicioPorIdServicio(Long servicioId) {
        String servicioQuery = "SELECT s FROM Servicio s WHERE s.id = :servicioId";
        List<Servicio> servicios = em.createQuery(servicioQuery, Servicio.class)
                .setParameter("clienteId", servicioId)
                .getResultList();

        return servicios;

    }

}
