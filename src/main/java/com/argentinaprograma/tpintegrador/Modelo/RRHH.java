/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import lombok.Data;

@Data
public class RRHH extends Sector{
    
    public RRHH(){
        super("Recursos Humanos");
    }

    @Override
    public void procesarIncidente(Incidente incidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void altaTecnico(Tecnico tecnico){
    
    }
    
     public void modificacionTécnico(Tecnico tecnico){
    
    }
     
     
   public void bajaTecnico(Tecnico tecnico){
    
    }
    
}
