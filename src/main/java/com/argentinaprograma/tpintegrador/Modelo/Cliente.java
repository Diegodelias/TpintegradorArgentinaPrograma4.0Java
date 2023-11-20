/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class Cliente extends Persona {
   
    private Set<Servicio> servicios;
    private String razonSocial;
    private String CUIT;
    private boolean notificadoIncidente;
    
    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        this.servicios = new HashSet<>();
    }
    
    
     public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio) {
        servicios.remove(servicio);
    }

    public boolean tieneHabilidad(Servicio servicio) {
        return servicios.contains(servicio);
    }

    
    public void asignarNuevoServicio(Servicio servicio) {
        this.agregarServicio(servicio);
        System.out.println("El cliente " + this.getNombre()+ " cuenta con los siguiente servicios " + servicio);
    }
    
    
}
