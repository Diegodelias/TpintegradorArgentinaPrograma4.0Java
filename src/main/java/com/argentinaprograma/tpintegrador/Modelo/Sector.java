/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import lombok.Data;

/**
 *
 * @author Windows 10
 */
@Data
public abstract class Sector {
    
    private String nombreSector;
    
    public Sector(String nombre){
    
     this.nombreSector = nombre;
    }
            
    public abstract void procesarIncidente(Incidente incidente);
    
    
    private void altaTecnico(){
    
    }
    
     private void bajaTecnico(){
    
    }
     
     private void modificacionTecnico(){
     
     }
            
            
   }
