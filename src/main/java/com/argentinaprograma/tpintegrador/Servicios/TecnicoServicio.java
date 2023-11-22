/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;

import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class TecnicoServicio {
     private final TecnicoRepository tecnicoRepository;

    public TecnicoServicio(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }
    
        public void crearTecnico(String nombre , String apellido , List<Especialidad> especialidades) {
        
          Tecnico tecnico = new Tecnico();
          tecnico.setNombre(nombre);
          tecnico.setApellido(apellido);
          
       //   System.out.println("SERVICIO SIZE " + servicios.size());
         especialidades.forEach(e -> tecnico.asignarNuevaHabilidad(e));
        //  servicios.forEach(e -> System.out.println(e.getCategoria()));
         
              
        tecnicoRepository.crearTecnico(tecnico);
     
    }
    
}
