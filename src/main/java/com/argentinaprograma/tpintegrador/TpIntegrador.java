/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argentinaprograma.tpintegrador;

import com.argentinaprograma.tpintegrador.Modelo.Cliente;
import com.argentinaprograma.tpintegrador.Modelo.Comercial;
import com.argentinaprograma.tpintegrador.Modelo.Especialidad;
import com.argentinaprograma.tpintegrador.Modelo.Estados.AltaInicialEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.EstadoIncidente;
import com.argentinaprograma.tpintegrador.Modelo.Incidente;
import com.argentinaprograma.tpintegrador.Modelo.RRHH;
import com.argentinaprograma.tpintegrador.Modelo.Servicio;
import com.argentinaprograma.tpintegrador.Modelo.Tecnico;

/**
 *
 * @author Windows 10
 */
public class TpIntegrador {

    public static void main(String[] args) {

         //dar de alta tecnico RRHH
         Tecnico tecnico1 = new Tecnico("Juan", "Perez");
         Tecnico tecnico2 = new Tecnico("Luis", "Muñoz");
         tecnico1.asignarNuevaHabilidad(Especialidad.SAP);
         tecnico1.asignarNuevaHabilidad(Especialidad.LINUX_UBUNTU);
         tecnico2.agregarHabilidad(Especialidad.WINDOWS);
         tecnico2.asignarNuevaHabilidad(Especialidad.SAP);
         tecnico2.asignarNuevaHabilidad(Especialidad.TANGO);
         
         RRHH recursosHumanos =  new RRHH();
         recursosHumanos.altaTecnico(tecnico1);
         recursosHumanos.altaTecnico(tecnico2);
         
          //dar de alta clientes Comercial
          
          Cliente cliente1 = new Cliente("María","Mendez");
          cliente1.asignarNuevoServicio(Servicio.SOPORTE_SAP);
          cliente1.asignarNuevoServicio(Servicio.SOPORTE_TANGO);
          Cliente cliente2 = new Cliente("Jorge","Andrade");
          cliente2.agregarServicio(Servicio.SOPORTE_WINDOWS);
          
          Comercial sectorComercial = new Comercial ("Sector Comercial");
          sectorComercial.altaCliente(cliente1);
          sectorComercial.altaCliente(cliente2);

        //mesa de ayuda
        
         //crear incidente
         //mesa de ayuda identifica cliente
        Incidente incidente = new Incidente(new AltaInicialEstado());
        incidente.getEstadoIncidente().identificarCliente(incidente, cliente1);
        incidente.getEstadoIncidente().identificarCliente(incidente, cliente2);
        
        //mostrar estados clientes
        
        
        
        
        
        
        //verificacion de servicios(estado Seleccion Cliente estado)
        
        
        //asignacion tecnico (cambio a estado Seleccion tecnico estado)
        
        //notifiacion a cliente incidente asignado(asignadoESTADO)
        
        //nofificacion a tecnico nuevo incidente a resolver  (ConfirmacionEstado)
        
        //
   
       
    }
}
