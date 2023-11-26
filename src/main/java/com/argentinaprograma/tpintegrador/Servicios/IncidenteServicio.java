/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Servicios;

import com.argentinaprograma.tpintegrador.Entidades.AltaInicialEstado;
import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.Servicio;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import com.argentinaprograma.tpintegrador.Repositorios.ClienteRepository;
import com.argentinaprograma.tpintegrador.Repositorios.EspecialidadRepository;
import com.argentinaprograma.tpintegrador.Repositorios.IncidenteRepository;
import com.argentinaprograma.tpintegrador.Repositorios.ServicioRepository;
import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class IncidenteServicio {

    private final IncidenteRepository incidenteRepository;
    private final ServicioRepository servicioRepository;
    private final ClienteRepository clienteRepository;
    private final TecnicoRepository tecnicoRepository;

    public IncidenteServicio(IncidenteRepository incidenteRepository, ServicioRepository servicioRepository, ClienteRepository clienteRepository, TecnicoRepository tecnicoRepository) {
        this.incidenteRepository = incidenteRepository;
        this.servicioRepository = servicioRepository;
        this.clienteRepository = clienteRepository;
        this.tecnicoRepository = tecnicoRepository;
    }

    public void crearIncidente(Scanner scanner) {
        System.out.println("ingresar ID  servicio que desea buscar");
        long idServicio = scanner.nextLong();

        AltaInicialEstado altaInicial = new AltaInicialEstado();
        
        Incidente incidente = new Incidente();
        incidente.setEstadoIncidente(altaInicial);
        //mostrarServicios(traer servicio por id de servicio)
        List<Servicio> serviciosPorIdServicio = servicioRepository.encontrarServicioPorServId(idServicio);

        serviciosPorIdServicio.forEach(servicio -> {
            incidente.setServicio(servicio);
        });

        System.out.println("descripcion del problema");
        String descripcion = scanner.next();

        System.out.println("ingresar dni cliente que desea buscar");
        String dni = scanner.next();
           List <Cliente> cliente = clienteRepository.seleccionarClientePorDni(dni);
        cliente.forEach(clienteItem -> {clienteItem.agregarIncidente(incidente) ;
                clienteRepository.actualizarCliente(clienteItem);
                });

        
        System.out.println("ingresar ID  tecnico ");
        long idTecnico = scanner.nextLong();

        List<Tecnico> tecnico = tecnicoRepository.encontrarTecnicoPorId(idTecnico);

        tecnico.forEach(tecnicoItem -> { tecnicoItem.agregarIncidente(incidente);    tecnicoRepository.actualizarTecnico(tecnicoItem); });

        incidenteRepository.crearIncidente(incidente);

    }

}
