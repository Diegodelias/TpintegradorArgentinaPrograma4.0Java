/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades.Estados;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class SeleccionTecnicoEstado implements EstadoIncidente {
    
        @Override
    public void identificarCliente(Incidente incidente, Cliente cliente) {
             System.out.println("Ingresa datos del cliente");
    }
    
     @Override
    public void seleccionarTipoServicioIncidente(Incidente indicidente, String tipoIncidente) {
        System.out.println("Ingrese  datos del cliente antes de poder reportar incidente");
    }

  

    public void asginarTecnico( Incidente incidente , Tecnico tecnico) {
        System.out.println("TECNICO SELECCIONADO");
        //CALCULAR TIEMPO ESTIMADO DE RESOLUCION
        //NOTIFICAR AL CLIETNE
     
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

    public void asginarTecnico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public void asginarTecnicoSeleccionado(Incidente incidente , Tecnico tecnico) {
        System.out.println("Ingrese datos del cliente antes de poder asignar tecnico al incidente");
    }
    
    
}
