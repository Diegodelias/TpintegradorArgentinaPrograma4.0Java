/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo.Estados;

import com.argentinaprograma.tpintegrador.Modelo.Cliente;

import com.argentinaprograma.tpintegrador.Modelo.Incidente;

/**
 *
 * @author Windows 10
 */
public class SeleccionClienteEstado implements EstadoIncidente {
    
     @Override
    public void identificarCliente(Incidente incidente, Cliente cliente) {
             System.out.println("Ingresa datos del cliente");
    }
    
    
    /*este estado incluye todo lo relacionado con la seleccion del servicio y dar una descripcion del problema*/

   @Override
    public void seleccionarTipoServicioIncidente(Incidente indicidente, String tipoIncidente) {
        System.out.println("Ingrese  datos del cliente antes de poder reportar incidente");
    }

  

    @Override
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

   
}
