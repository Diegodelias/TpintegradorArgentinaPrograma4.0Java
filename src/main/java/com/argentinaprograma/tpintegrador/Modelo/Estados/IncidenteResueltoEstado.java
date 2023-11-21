package com.argentinaprograma.tpintegrador.Modelo.Estados;

import com.argentinaprograma.tpintegrador.Modelo.Cliente;
import com.argentinaprograma.tpintegrador.Modelo.Incidente;
import com.argentinaprograma.tpintegrador.Modelo.Tecnico;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Windows 10
 */
public class IncidenteResueltoEstado implements EstadoIncidente {
    
    @Override
    public void identificarCliente(Incidente incidente, Cliente cliente) {
               System.out.println("Ingresa datos del cliente");
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
        System.out.println("Ingrese datos del cliente antes de poder notificar tecnico");
    }

    @Override
    public void resolucionIncidente() {
        System.out.println("Incidente resuelto ");
        System.out.println("Enviar mail cliente incidente solucionado");
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
