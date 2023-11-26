/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import lombok.Data;

/**
 *
 * @author Windows 10
 */
@Data
public class TrabajosTecnico {
    private String FechaResolucion;
    private  Incidente infoIncidente;
    private Boolean confirmado;
    
}
