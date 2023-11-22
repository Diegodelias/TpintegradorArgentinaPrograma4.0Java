/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;


import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import com.argentinaprograma.tpintegrador.Servicios.ClienteService;
import com.argentinaprograma.tpintegrador.Servicios.TecnicoServicio;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class RRHH {
    
    private String nombreSector  = "Recursos Humanos"; 
    private List<Tecnico> listaTecnico = new ArrayList<>();
    
    
  

    
    public  void altaTecnico(String nombre , String descripcion ,  List <Especialidad> especialidades1){
        
        TecnicoServicio clienteService = new TecnicoServicio(new TecnicoRepository());
        clienteService.crearTecnico(nombre, nombre, especialidades1);
        
       
        
       
    
    }
    
     public void modificacionTécnico(Tecnico tecnico){
    
    }
     
     
   public void bajaTecnico(Tecnico tecnico){
    
    
   }
   
   public void emitirReportes(){}
   
   
 
   
    
}
