/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import com.argentinaprograma.tpintegrador.Modelo.Estados.AltaInicialEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.EstadoIncidente;
import lombok.Data;

/**
 *
 *
 */
@Data
public class Incidente {
    
    private EstadoIncidente estadoIncidente;
    
    
    //al instanciar desde el contructor Iniciar con alta Inicial estado
    public Incidente(AltaInicialEstado estadoInicialProceso){
        this.estadoIncidente = estadoInicialProceso;
    }
    
    public void altaCliente(Cliente cliente) {
         //pasamos el incidente mismo como parametro       
        estadoIncidente.identificarCliente(this, cliente);
    }
    
    
    
    //set y get para estadoIncidente ya existen pro Lombok
}
