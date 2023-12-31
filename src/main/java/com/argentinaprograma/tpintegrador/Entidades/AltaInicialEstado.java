package com.argentinaprograma.tpintegrador.Entidades;



import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Estados.EstadoIncidente;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

@Data
@Entity
@Table(name = "EstadoInicial")
public class AltaInicialEstado  implements EstadoIncidente{
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
   
   
  
    
    
    // @OneToOne(mappedBy = "estadoIncidente")
   //  private Incidente incidente;
    //en listado clientes base de datos obtener todos los clientes
    
    /*
     Este estado incluye  todo lo relacionado a solicitar y almacenar datos del cliente
    */

    public void identificarClientes(Incidente indicidente, List<Cliente> clientes) {
        System.out.println("Ingresa datos del cliente");
        clientes.forEach(cliente -> System.out.println("El cliente " + cliente.getNombre() + " " + cliente.getApellido() + " cuenta con soporte contratado para los siguientes servicios" + cliente.getServicios()));
        
        //logica ingreso datos del cliente deberían ingresarse datos del cliente
        // sistema verifica datos del cliente y verifica servicios contratados
    }

    @Override
    public void seleccionarTipoServicioIncidente(Incidente incidente, String tipoIncidente) {
        System.out.println("Ingrese  datos del cliente antes de poder seleccionar tipo servicio del  incidente");
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
    public void identificarCliente(Incidente incidente, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public void asginarTecnico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void asginarTecnico(Incidente incidente, Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
