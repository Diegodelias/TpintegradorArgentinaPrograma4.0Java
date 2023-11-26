/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

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
        String nombreEspecialidad = scanner.next();
        System.out.println("Ingreso descripcion");
        String descripcion = scanner.nextLine(); 
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
     
    
}
