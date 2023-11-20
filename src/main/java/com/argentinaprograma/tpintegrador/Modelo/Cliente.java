/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import java.util.Set;
import lombok.Data;

@Data
public class Cliente extends Persona {
   
    private Set<Servicio> servicios;
    private String razonSocial;
    private String CUIT;
    
    
    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    
     public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio) {
        servicios.remove(servicio);
    }

    public boolean tieneHabilidad(Servicio servicio) {
        return servicios.contains(servicio);
    }

    
    public void asignarNuevoServicio(Servicio servicio) {
        agregarServicio(servicio);
        System.out.println("Al cliente " + this.getNombre()+ " le ha sido asignado el servicio " + servicio);
    }
    
    
}
