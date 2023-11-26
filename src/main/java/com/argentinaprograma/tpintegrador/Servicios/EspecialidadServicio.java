/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.CategoriasServicio;
import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import com.argentinaprograma.tpintegrador.Repositorios.EspecialidadRepository;
import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import java.util.Scanner;


/**
 *
 * @author Windows 10
 */
public class EspecialidadServicio {
    
     private final EspecialidadRepository especialidadRepository ;
     
        public EspecialidadServicio(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }
    
     public void crearEspecialidad(Scanner scanner){
         
        System.out.println("Ingreso el nombre especialidad");
        String nombreEspecialidad =  mostrarMenuCategorias().name();
        System.out.println("Ingreso descripcion");
        String descripcion = scanner.next(); 
        System.out.println("Ingreso puntaje");
        int puntaje = 0;
        
          try {
            puntaje = scanner.nextInt();
            scanner.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("valor invalido puntaje.");
        }
        
        
        
        Especialidad especialidad = new Especialidad();
        especialidad.setNombre(nombreEspecialidad);
        
        especialidad.setDescripcion(descripcion);
        especialidad.setEspecialidadPuntaje(puntaje);
        
        especialidadRepository.crearEspecialidad(especialidad);
        
        
         
         
     }
     
      public void crearIncidente(Scanner scanner){
          
          
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

     
    
}
