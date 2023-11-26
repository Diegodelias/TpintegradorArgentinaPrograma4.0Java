/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades.Estados;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Windows 10
 */
@Data
public class SeleccionClienteEstado implements EstadoIncidente {
    
     @Override
    public void identificarCliente(Incidente incidente, Cliente cliente) {
             System.out.println("Ingresa datos del cliente");
    }
    
    
    /*este estado incluye todo lo relacionado con la seleccion del servicio y dar una descripcion del problema*/

   @Override
    public void seleccionarTipoServicioIncidente(Incidente incidente, String tipoIncidente) {
        System.out.println("Mostrar listado tecnicos disponibles para resolver el incidente");
      
        
        //recorrer listado Tecnicos (supongo que se obtendrían de la base de datos)
        //si tecncio tienen habilidad que coincide con tipo de incidente
        
    }

  

    public void asginarTecnico() {
        System.out.println("Ingrese datos del cliente antes de poder asignar tecnico al incidente");
    }

    @Override
    public void notificarTecnico() {
        System.out.println("Ingrese datos del cliente antes de poder notificar tecnico");
    }

    @Override
    public void resolucionIncidente() {
        System.out.println("Ingrese datos del cliente antes de poder marcar incidente como solucionado ");
    }

    @Override
    public void notificarCliente() {
        System.out.println("Ingrese datos del cliente antes de poder noficar al cliente que el incidente fue solucionado");
    }

    @Override
    public void identificarClientes(Incidente incidente, List<Cliente> Listaclientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void asginarTecnico(Incidente incidente, Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
