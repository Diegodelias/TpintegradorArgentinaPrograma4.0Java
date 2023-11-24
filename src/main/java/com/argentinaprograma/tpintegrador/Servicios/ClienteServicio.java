/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.ServicioEnum;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ClienteServicio {
    
    private final ClienteRepository clienteRepository;

    public ClienteServicio(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    public void crearCliente(Scanner scanner) {
        System.out.println("Ingreso el nombre del cliente");
        String nombreTecnico = scanner.next();
        System.out.println("Ingreso apellido tecnico");
        String apellido = scanner.next(); 
        System.out.println("Ingreso cuit");
        String cuit = scanner.next(); 
        System.out.println("Razon social");
        String razonSocial = scanner.next(); 
        Cliente cliente = new Cliente();
        cliente.setNombre(nombreTecnico);
        cliente.setApellido(apellido);
        cliente.setCUIT(cuit);
        cliente.setRazonSocial(razonSocial);
        clienteRepository.crearCliente(cliente);
     
    }
    
    public void traerTodosLosClientes(){

        
         // clienteRepository.TodosLosClientes();
        
        System.out.println("Listado de clientes:");
       clienteRepository.TodosLosClientes().forEach(cliente -> {
            System.out.println("Nombre: " + cliente.getNombre() +
                    ", Apellido: " + cliente.getApellido() +
                    ", Cuit: " + cliente.getCUIT() +
                    ", Razon Social " + cliente.getRazonSocial())
                    ;
        });
       
            
        
    }
    
}
