package com.argentinaprograma.tpintegrador.Modelo.Estados;



import com.argentinaprograma.tpintegrador.Modelo.Cliente;

import com.argentinaprograma.tpintegrador.Modelo.Incidente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Windows 10
 */
public class AltaInicialEstado  implements EstadoIncidente{
    
    /*
     Este estado incluye  todo lo relacionado a solicitar y almacenar datos del cliente
    */

    public void identificarCliente(Incidente indicidente, Cliente cliente) {
        System.out.println("Ingresa datos del cliente");
        //logica ingreso datos del cliente deberían ingresarse datos del cliente
        // sistema verifica datos del cliente y verifica servicios contratados
    }

    @Override
    public void seleccionarTipoServicioIncidente(Incidente incidente, String tipoIncidente) {
        System.out.println("Ingrese  datos del cliente antes de poder seleccionar tipo servicio del  incidente");
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
