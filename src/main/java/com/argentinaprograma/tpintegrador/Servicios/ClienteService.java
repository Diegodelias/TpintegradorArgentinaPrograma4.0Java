/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.ServicioEnum;
import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import java.util.List;



public class ClienteService {
    
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    public void crearCliente(String nombre , String apellido , List<Servicio> servicios) {
        
          Cliente cliente = new Cliente();
          cliente.setNombre("Juan");
          cliente.setApellido("Perez");
          
       //   System.out.println("SERVICIO SIZE " + servicios.size());
         servicios.forEach(e -> cliente.asignarNuevoServicio(e));
        //  servicios.forEach(e -> System.out.println(e.getCategoria()));
         
              
        clienteRepository.crearCliente(cliente);
     
    }
    
}
