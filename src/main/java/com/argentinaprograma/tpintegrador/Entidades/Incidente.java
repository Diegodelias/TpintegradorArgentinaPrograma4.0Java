/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Modelo.Estados.SeleccionTecnicoEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.AltaInicialEstado;
import com.argentinaprograma.tpintegrador.Modelo.Estados.EstadoIncidente;
import lombok.Data;

/**
 *
 *
 */
@Data
public class Incidente {
    
    private EstadoIncidente estadoIncidente;
    private String servicio;
    private String descripcionProblema;
    private String tipoProblema;
    private Boolean resuelto;
    

    
    //al instanciar desde el contructor Iniciar con alta Inicial estado
    public Incidente(AltaInicialEstado estadoInicialProceso){
        this.estadoIncidente = estadoInicialProceso;
        this.resuelto = false;
    }
    
    public void altaCliente(Cliente cliente) {
         //pasamos el incidente mismo como parametro       
        estadoIncidente.identificarCliente(this, cliente);
    }
    
    public void verificarTecnicosDisponibles(){
      estadoIncidente.seleccionarTipoServicioIncidente(this, tipoProblema);
    }
    
    
    public void seleccionarTecnico(Tecnico tecnicoSeleccionado) {
        estadoIncidente.asginarTecnico(this,tecnicoSeleccionado);
   
    }
    
    
    public void confirmarIncidente() {
        estadoIncidente.notificarTecnico();
    
    }
    
    
    public void incidenteResuelto(){
        
        estadoIncidente.resolucionIncidente();
    
    }
    //set y get para estadoIncidente ya existen pro Lombok
}
