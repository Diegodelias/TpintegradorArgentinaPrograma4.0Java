/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;


import com.argentinaprograma.tpintegrador.Modelo.EspecialidadEnum;
import com.argentinaprograma.tpintegrador.Repositorios.TecnicoRepository;
import com.argentinaprograma.tpintegrador.Servicios.ClienteServicio;
import com.argentinaprograma.tpintegrador.Servicios.TecnicoServicio;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class RRHH {
    
    private String nombreSector  = "Recursos Humanos"; 
    private List<Tecnico> listaTecnico = new ArrayList<>();
    
    
  
    
    
    
    
    
    
    public void altaIncialTecnicos(){
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
          this.altaTecnico("Jorge", "Fernandez", especialidades1);
    
    
    }
    
    
    
    
    

    
    public  void altaTecnico(String nombre , String descripcion ,  List <Especialidad> especialidades1){
        
     //   TecnicoServicio tecnicoServicio = new TecnicoServicio(new TecnicoRepository());
       // tecnicoServicio.crearTecnico(nombre, nombre, especialidades1);
        
       
        
       
    
    }
    
     public void modificacionTécnico(Tecnico tecnico){
    
    }
     
     
   public void bajaTecnico(Tecnico tecnico){
    
    
   }
   
   public void emitirReportes(){}
   
   
 
   
    
}
