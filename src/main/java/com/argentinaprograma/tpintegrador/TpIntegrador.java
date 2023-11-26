/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argentinaprograma.tpintegrador;

import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Especialidad;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.ServicioEnum;
import com.argentinaprograma.tpintegrador.Modelo.Comercial;
import com.argentinaprograma.tpintegrador.Modelo.EspecialidadEnum;
import com.argentinaprograma.tpintegrador.Modelo.Estados.AltaInicialEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.ConfirmacionEstado;

import com.argentinaprograma.tpintegrador.Modelo.Estados.IncidenteResueltoEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.SeleccionClienteEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.SeleccionTecnicoEstado;
import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.RRHH;

import com.argentinaprograma.tpintegrador.Entidades.Tecnico;

import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import com.argentinaprograma.tpintegrador.Repositorios.EspecialidadRepository;
import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import com.argentinaprograma.tpintegrador.Servicios.ClienteServicio;
import com.argentinaprograma.tpintegrador.Servicios.EspecialidadServicio;
import com.argentinaprograma.tpintegrador.Servicios.TecnicoServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;



/**
 *
 * @author Windows 10
 */
public class TpIntegrador {
    
      public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }


    public static void main(String[] args) {
        //carga inicial  clientes
        
        TecnicoServicio tecnicoServicio = new TecnicoServicio(new TecnicoRepository());
        ClienteServicio clienteServicio = new ClienteServicio(new ClienteRepository());
        EspecialidadServicio especialidadServicio = new EspecialidadServicio(new EspecialidadRepository());

       
        
         Scanner scanner = new Scanner(System.in);
         
         int opcion;
         long nroCliente;
         
           do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Mostrar Técnicos");
            System.out.println("5. Registrar Especialidad");
            System.out.println("6. Asignar  Especialidad a tecnico");
            System.out.println("7. Registrar Servicio en cliente");
            System.out.println("8. Registrar Incidente");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                   clienteServicio.crearCliente(scanner);
                    break;
                case 2:
                    tecnicoServicio.crearTecnico(scanner);
                    break;
                case 3:
                    clienteServicio.traerTodosLosClientes();
                    break;
                case 4:
                    //tecnicoServicio.traerTodosLosTecnicos();
                    tecnicoServicio.tecnicosConEspecialidades();
                    break;
                case 5:
                    especialidadServicio.crearEspecialidad(scanner);
                     break;
                case 6:
                    tecnicoServicio.asignarEspecialidadTecnico(scanner);
                   // ic.agregarIncidente(
                     //       pc.buscarClienteId(nroCliente)
                   // );
                    break;
                 
                case 7:
                    clienteServicio.registrarServicioEnCliente(scanner);
                   // ic.agregarIncidente(
                     //       pc.buscarClienteId(nroCliente)
                   // );
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
         
                
         
         
      
        
        /*List <Servicio> servicios = new ArrayList<>();
        
        Servicio servicio1 = new Servicio();
        servicio1.setCategoria(ServicioEnum.SOPORTE_MAC_OS.name());
        servicio1.setDescripcion("reinstalacion Mac Os");
        servicio1.setComplejidadPuntaje(4);
        Servicio servicio2 = new Servicio();
        servicio2 = new Servicio();
        servicio2.setCategoria(ServicioEnum.SOPORTE_WINDOWS.name());
        servicio2.setDescripcion("actualizar licencia");
        servicio2.setComplejidadPuntaje(2);
        servicios.add(servicio1);
        servicios.add(servicio2);
        
        Cliente cliente2 = new Cliente();
         cliente2.setNombre("Juan");
         cliente2.setApellido("Perez");
     
         ClienteService clienteService = new ClienteService(new ClienteRepository());
        clienteService.crearCliente("juan", "PEREZ" ,servicios);
        
        
        // carga inicial tecnicos
        
          List <Especialidad> especialidades1 = new ArrayList<>();
          Especialidad especialidad1 = new Especialidad();
          especialidad1.setNombre(EspecialidadEnum.LINUX_UBUNTU.name());
          especialidad1.setDescripcion("especializado en Tango");
          especialidad1.setEspecialidadPuntaje(5);
          
          especialidades1.add(especialidad1);
          
          Especialidad especialidad2 = new Especialidad();
          especialidad2.setNombre(EspecialidadEnum.SAP.name());
          especialidad1.setDescripcion("especializado en SAP");
          especialidad1.setEspecialidadPuntaje(2);
          
          especialidades1.add(especialidad1);
          especialidades1.add(especialidad2);
          
        
        
          
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


      
         Tecnico tecnico1 = new Tecnico();
         Tecnico tecnico2 = new Tecnico();
         tecnico1.asignarNuevaHabilidad(EspecialidadEnum.SAP);
         tecnico1.asignarNuevaHabilidad(EspecialidadEnum.LINUX_UBUNTU);
         tecnico2.agregarHabilidad(EspecialidadEnum.WINDOWS);
         tecnico2.asignarNuevaHabilidad(EspecialidadEnum.SAP);
         tecnico2.asignarNuevaHabilidad(EspecialidadEnum.TANGO);
         
         RRHH recursosHumanos =  new RRHH();
         recursosHumanos.altaTecnico(tecnico1);
         recursosHumanos.altaTecnico(tecnico2);
         
         List <Tecnico> todosLosTecnicos = recursosHumanos.getListaTecnico();
         
      
         
          //dar de alta clientes Comercial
          
        Cliente cliente1 = new Cliente("María","Mendez");
          cliente1.asignarNuevoServicio(Servicio.SOPORTE_SAP);
          cliente1.asignarNuevoServicio(Servicio.SOPORTE_TANGO);
          Cliente cliente2 = new Cliente("Jorge","Andrade");
          cliente2.agregarServicio(Servicio.SOPORTE_WINDOWS);*/
         
    
         
          
       
    
          
          /*
        
          
          Comercial sectorComercial = new Comercial ("Sector Comercial");
        //  sectorComercial.altaCliente(cliente1);
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
    
*/
}

}