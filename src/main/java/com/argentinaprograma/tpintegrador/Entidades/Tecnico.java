/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;



import java.util.ArrayList;
import java.util.Set;
import lombok.Data;
import java.util.HashSet;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "tecnicos")
public class Tecnico  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
  
    //un tecnico puede tener muchas especialidades y varias especialidades pueden pertenecer a varios tecnicos
   // private Set<Especialidad> especialidades;
     
    
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id")
    )
    private List<Especialidad> especialidades = new ArrayList<>();
    
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "tecnico_id")
    private  List<Incidente> incidentes =new ArrayList<>();
    
    
  public void agregarIncidente(Incidente incidente){
         incidentes.add(incidente);
    
     
     }
    
    
    
    private Set<TrabajosTecnico> trabajosPendientes;
    //tecnico en experiencia puntaje tiempo estimado  complejidad en clase programa


  


/*
    public void agregarHabilidad(Especialidad especialidad) {
       
        
        if(especialidad != null){
                especialidades.add(especialidad);
                especialidad.getTecnicos();
                especialidad.getTecnicos().add(this);
                System.out.println("se ha agregado la especialidad " + especialidad.getNombre() + " ' al tecnico '" + this.getNombre() + "'");
        
        } else {
            System.out.println("No se peude agregar especialidad al tecnico");
        }
        
    }*/
    
    
    public void agregarEspecialidad(Especialidad especialidad) {
            especialidades.add(especialidad);
            especialidad.getTecnicos().add(this);
}

    public void eliminarEspecialidad(Especialidad especialidad) {
              especialidades.remove(especialidad);
             especialidad.getTecnicos().remove(this);
    }

    public boolean tieneHabilidad(String problema) {
        
        return especialidades.contains(problema);
    }

    
    public void asignarNuevaHabilidad(Especialidad nuevaHabilidad) {
        agregarEspecialidad(nuevaHabilidad);
        System.out.println("Al tecnico " + this.getNombre()+ " le ha sisdo asinada la Habilidad " + nuevaHabilidad);
    }
    
    
    
    
    
}
