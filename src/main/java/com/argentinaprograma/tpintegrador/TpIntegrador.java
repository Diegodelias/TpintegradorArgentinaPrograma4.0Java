/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argentinaprograma.tpintegrador;

import com.argentinaprograma.tpintegrador.Modelo.Cliente;
import com.argentinaprograma.tpintegrador.Modelo.Comercial;
import com.argentinaprograma.tpintegrador.Modelo.Especialidad;
import com.argentinaprograma.tpintegrador.Modelo.Estados.AltaInicialEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.ConfirmacionEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.EstadoIncidente;
import com.argentinaprograma.tpintegrador.Modelo.Estados.IncidenteResueltoEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.SeleccionClienteEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.SeleccionTecnicoEstado;
import com.argentinaprograma.tpintegrador.Modelo.Incidente;
import com.argentinaprograma.tpintegrador.Modelo.RRHH;
import com.argentinaprograma.tpintegrador.Modelo.Servicio;
import com.argentinaprograma.tpintegrador.Modelo.Tecnico;
import java.util.ArrayList;
import java.util.List;

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
         
         List <Tecnico> todosLosTecnicos = recursosHumanos.getListaTecnico();
         
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

       incidente.getEstadoIncidente().identificarClientes(incidente, sectorComercial.obtenerTodosLosClientes());
       
       incidente.setEstadoIncidente(new SeleccionClienteEstado());
       
       
       //verificar tecnicos disponibles y mostrar listado
       incidente.verificarTecnicosDisponibles();
       
       
       //operador selecciona uno de los tecnicos disponibles y el sistema le informa tiempo estimado de resolucion(en que se base el tiempo
       //estimado de resolucion?
       
       incidente.setEstadoIncidente(new SeleccionTecnicoEstado());
       incidente.seleccionarTecnico(tecnico1);
       
        
       //confirmacion incidente
       
        incidente.setEstadoIncidente(new ConfirmacionEstado());
        incidente.confirmarIncidente();
        
        
        incidente.setEstadoIncidente(new IncidenteResueltoEstado());
        incidente.incidenteResuelto();
        
  
    }
    

}
