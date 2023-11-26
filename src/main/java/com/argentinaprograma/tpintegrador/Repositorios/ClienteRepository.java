/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Repositorios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Persistencia.PersistenceManager;
import static com.argentinaprograma.tpintegrador.TpIntegrador.getEntityManager;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Windows 10
 */
public class ClienteRepository {
  
    

   EntityManager em = getEntityManager();
   
  
    
    public void crearCliente(Cliente cliente){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(cliente);
        tx.commit();
    
    }
    
      public List<Cliente> TodosLosClientes() {

        return em.createQuery("select c from Cliente c", Cliente.class).getResultList();
    }
      
     public List<Cliente> seleccionarClientePorDni(String dni){
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
     
    public void actualizarCliente(Cliente cliente) {

        try {
            em.getTransaction().begin();

            // Persist the updated client back to the database
            em.merge(cliente);

            em.getTransaction().commit();
            System.out.println("Client actualizado correctamente.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace(); // Handle the exception appropriately
        } finally {
            em.close();
        }

    }
    
}
