/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo.Estados;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class ConfirmacionEstado implements EstadoIncidente{
    
    /*contiene toda la logica para confirmar el incidente e informar al cliente*/

    @Override
    public void identificarCliente(Incidente incidente, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   @Override
    public void seleccionarTipoServicioIncidente(Incidente indicidente, String tipoIncidente) {
        System.out.println("Ingrese  datos del cliente antes de poder reportar incidente");
    }


    public void asginarTecnico() {
        System.out.println("Ingrese datos del cliente antes de poder asignar tecnico al incidente");
    }

    @Override
    public void notificarTecnico() {
        System.out.println("Al confirmarse el  incidente le sistema debe enviar una notificacion al tecnico informandole que tiene un nuevo incidente para resolver");
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
