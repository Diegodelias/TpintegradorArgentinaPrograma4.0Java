/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Windows 10
 */
public class PersistenceManager {
    
    private final EntityManagerFactory factory;
    private final EntityManager em;

    public PersistenceManager() {
        factory = Persistence.createEntityManagerFactory("JPA_PU");
        em = factory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public void close() {
        em.close();
        factory.close();
    }
        
    
             
}
