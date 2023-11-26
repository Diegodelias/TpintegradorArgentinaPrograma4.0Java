/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import lombok.Data;

@Data
public class MesaAyuda extends Sector {

    public MesaAyuda(String nombre) {
        super(nombre);
    }

    @Override
    public void procesarIncidente(Incidente incidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void agregarHorasResolucion(){
    }
}
