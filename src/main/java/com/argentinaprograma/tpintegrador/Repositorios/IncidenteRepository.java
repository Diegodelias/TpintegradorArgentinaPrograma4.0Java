/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Repositorios;

import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import static com.argentinaprograma.tpintegrador.TpIntegrador.getEntityManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Windows 10
 */
public class IncidenteRepository {
    EntityManager em = getEntityManager();
    
   public void crearIncidente(Incidente incidente){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(incidente);
        tx.commit();
    
    }
        
    
}
