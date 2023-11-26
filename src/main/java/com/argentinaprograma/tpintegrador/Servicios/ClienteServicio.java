/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.CategoriasServicio;
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
        System.out.println("Ingreso apellido cliente");
        String apellido = scanner.next(); 
        System.out.println("Ingreso dni");
        String dni = scanner.next(); 
        System.out.println("Ingreso cuit");
        String cuit = scanner.next(); 
        System.out.println("Razon social");
        String razonSocial = scanner.next(); 
        Cliente cliente = new Cliente();
        cliente.setNombre(nombreTecnico);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        cliente.setCUIT(cuit);
        cliente.setRazonSocial(razonSocial);
        clienteRepository.crearCliente(cliente);
     
    }
    
    public void traerTodosLosClientes(){

        
         // clienteRepository.TodosLosClientes();
        
        System.out.println("Listado de clientes:");
       clienteRepository.TodosLosClientes().forEach(cliente -> {
            System.out.println("Nombre: " + cliente.getNombre() +
                    ",DNI: " + cliente.getDni() +
                    ", Apellido: " + cliente.getApellido() +
                    ", Cuit: " + cliente.getCUIT() +
                    ", Razon Social " + cliente.getRazonSocial())
                    ;
        });
       
            
        
    }
    
    
    public void registrarServicioEnCliente(Scanner scanner){
        System.out.println("ingresar dni cliente que desea buscar");
        String dni = scanner.next();
       List <Cliente> cliente = clienteRepository.seleccionarClientePorDni(dni);
       
       if(dni != null) {
            System.out.println("ingresar Categoria del Servicio");
            
            String categoria = mostrarMenuCategorias().name();
            System.out.println("ingresar descripcion del servicio");
            String descripcion = scanner.next();
            System.out.println("ingresar puntaje complejidad del servicio");
            int pcomplejidad = scanner.nextInt();
            Servicio servicio = new Servicio();
            servicio.setCategoria(categoria);
            servicio.setDescripcion(descripcion);
            servicio.setComplejidadPuntaje(pcomplejidad);
           cliente.forEach(cli -> { cli.agregarServicio(servicio);

           clienteRepository.actualizarCliente(cli);});}
       

           
           
         }
    
    
    public CategoriasServicio mostrarMenuCategorias(){
           Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccionar Categoria:");
        int optionNumber = 1;
        for (CategoriasServicio servicio : CategoriasServicio.values()) {
            System.out.println(optionNumber + ". " + servicio);
            optionNumber++;
        }
  
        
        
        System.out.print("Ingresar numero opcion seleccionada: ");
        int usuarioSeleccion = scanner.nextInt();

      return  procesarSeleccionUsuario(usuarioSeleccion);
    
    
    }
    
    
    public CategoriasServicio procesarSeleccionUsuario(int seleccion){
        
        CategoriasServicio valorSeleccionado = null;
        if (seleccion >= 1 && seleccion <= CategoriasServicio.values().length) {
            valorSeleccionado = CategoriasServicio.values()[seleccion - 1];
            System.out.println("Opcion seleccionada numero : " + seleccion);
            System.out.println("valor opcion: " + valorSeleccionado);
        } else if (seleccion == 0) {
            System.out.println("Saliendo...");
            return valorSeleccionado;
        } else {
            System.out.println("La opcion seleccionada es invalida");
        }
    
     
         return valorSeleccionado;

    
    
    }
    
    
    public void mostrarServiciosContratados(Scanner scanner){
        
        System.out.println("Ingresar razon social cliente");
        String razonSocialCliente = scanner.next();
        System.out.println("Ingresar cuit cliente");
        String cuitCliente = scanner.next();
        
        clienteRepository.serviciosContradosPorCliente(razonSocialCliente, cuitCliente);
        
    
    
    }
    
}
