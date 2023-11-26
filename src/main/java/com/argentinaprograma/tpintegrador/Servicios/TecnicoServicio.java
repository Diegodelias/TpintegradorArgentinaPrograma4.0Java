/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import com.argentinaprograma.tpintegrador.Entidades.CategoriasServicio;

import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import com.argentinaprograma.tpintegrador.Repositorios.EspecialidadRepository;
import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class TecnicoServicio {
     private final TecnicoRepository tecnicoRepository;
  

    public TecnicoServicio(TecnicoRepository tecnicoRepository ) {
        this.tecnicoRepository = tecnicoRepository;
       
    }
    
    
    
    public void crearTecnico(Scanner scanner){
     
        System.out.println("Ingreso el nombre del tecnico");
        String nombreTecnico = scanner.next();
        System.out.println("Ingreso apellido tecnico");
        String apellido = scanner.next(); 
        
        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(nombreTecnico);
        tecnico.setApellido(apellido);
        
         tecnicoRepository.crearTecnico(tecnico);
        
        
    };
    
       public void traerTodosLosTecnicos(){

        
         // clienteRepository.TodosLosClientes();
        
        System.out.println("Listado de Tecnicos:");
     
      tecnicoRepository.TodosLosTecnicos().forEach(tecnico -> {
            System.out.println("Nombre Tecnico: " + tecnico.getNombre() +
                    ", Apellido Tecnico: " + tecnico.getApellido())
                    ;
        });
       
            
        
    }
       
    public void tecnicosConEspecialidades(){
        tecnicoRepository.TodosLosTecnicosEspecialidades();
    
    }
       
       public void asignarEspecialidadTecnico(Scanner scanner){
           
           tecnicoRepository.asignarEspecialidadTecnico();
           
           
       
       
       }
       
    
    
 
}
