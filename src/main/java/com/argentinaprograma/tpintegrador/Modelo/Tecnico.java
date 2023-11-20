/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;


import java.util.Set;
import lombok.Data;
import java.util.HashSet;


@Data
public class Tecnico  extends Persona{
    
        
    private Set<Especialidad> especialidades;

    public Tecnico(String nombre, String apellido){
        super(nombre,apellido);
        this.especialidades =  new HashSet<>();
    
    
    }
    
  



    public void agregarHabilidad(Especialidad especialidad) {
        especialidades.add(especialidad);
    }

    public void eliminarHabilidad(Especialidad especialidad) {
        especialidades.remove(especialidad);
    }

    public boolean tieneHabilidad(Especialidad especialidad) {
        return especialidades.contains(especialidad);
    }

    
    public void asignarNuevaHabilidad(Especialidad nuevaHabilidad) {
        agregarHabilidad(nuevaHabilidad);
        System.out.println("Al tecnico " + this.getNombre()+ " le ha sisdo asinada la Habilidad " + nuevaHabilidad);
    }
}
