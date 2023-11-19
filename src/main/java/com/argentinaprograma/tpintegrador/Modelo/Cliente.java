/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import lombok.Data;

@Data
public class Cliente extends Persona {
    private String razonSocial;
    private String CUIT;
    
    
    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    
    
    
    
}
