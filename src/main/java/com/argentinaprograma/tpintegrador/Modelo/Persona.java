/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import lombok.Data;

@Data
public class Persona {
    private String nombre ;
    private String apellido;
    
    public Persona(String nombre, String apellido){
   
        this.nombre = nombre;
        this.apellido = apellido;
    
    }
    
}
