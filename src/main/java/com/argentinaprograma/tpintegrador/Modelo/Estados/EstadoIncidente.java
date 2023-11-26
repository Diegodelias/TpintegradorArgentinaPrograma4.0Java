/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface EstadoIncidente {
    
    
    void identificarClientes(Incidente incidente , List <Cliente> Listaclientes);
    
    /* identificar cliente:El cliente llama a la mesa de ayuda y proporciona datos de identificación 
    (razón social, CUIT). Estos datos se ingresan en el sistema para mostrar 
    los servicios contratados por el cliente.*/
    void identificarCliente(Incidente incidente , Cliente cliente);
    
    
    /*repotar incidente: El operador solicita al cliente el servicio por el cual desea reportar el incidente,
    junto con la descripción y el tipo de problema.*/
    void  seleccionarTipoServicioIncidente(Incidente indicidente , String tipoIncidente);
    
    /*asignarTecnico: Tras ingresar el incidente, el sistema muestra una lista de técnicos 
    disponibles para resolver el problema. El operador selecciona 
    uno y recibe el tiempo estimado de resolución. Informa al cliente sobre la 
    creación del incidente y la fecha probable de solución.*/
    void asginarTecnico(Incidente incidente ,Tecnico tecnico);
    
    /*notificarTecnico: Una vez confirmado el incidente, el sistema notifica al técnico sobre el nuevo incidente para resolver. */
    void notificarTecnico();
    
    /*resolucionIncidente : El técnico atiende y resuelve el incidente, marcándolo como "resuelto" e incluyendo consideraciones necesarias. */
    void resolucionIncidente();
    
    /*notificarCliente: Tras la resolución, el sistema envía un email al cliente informándole que su incidente ha sido solucionado. */
    void notificarCliente();
    
}
