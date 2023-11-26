/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;
import com.argentinaprograma.tpintegrador.Entidades.Tecnico;
import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import com.argentinaprograma.tpintegrador.Entidades.Estados.SeleccionTecnicoEstado;
import com.argentinaprograma.tpintegrador.Entidades.Estados.EstadoIncidente;
import javax.persistence.CascadeType;
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

@Entity
@Table(name = "incidente")
@Data
public class Incidente {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
 
    private EstadoIncidente estadoIncidente;
    
    /*@OneToOne
    @JoinColumn(name = "altaIncialEstado_id")*/

    private AltaInicialEstado altaInicial;
    private Servicio servicio;
    private String descripcionProblema;
    private String tipoProblema;
    private Boolean resuelto;
    
    
    private Cliente Cliente;
    private Tecnico TecnicoAsignado;
    

    public Incidente(){
    
    
    }
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
