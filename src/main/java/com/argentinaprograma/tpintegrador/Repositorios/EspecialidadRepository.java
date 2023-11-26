/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Repositorios;

import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import static com.argentinaprograma.tpintegrador.TpIntegrador.getEntityManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Windows 10
 */
public class EspecialidadRepository {
         EntityManager em = getEntityManager();
         
        public void crearEspecialidad(Especialidad especialidad){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(especialidad);
        tx.commit();
    
    }
        
            
     public List<Especialidad> listarEspecialidades() {

        return em.createQuery("select e from Especialidad e", Especialidad.class).getResultList();
    }
    
         
         
    
}
