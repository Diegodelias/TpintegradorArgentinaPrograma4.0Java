/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;


import com.argentinaprograma.tpintegrador.Modelo.EspecialidadEnum;
import com.argentinaprograma.tpintegrador.Modelo.Persona;
import com.argentinaprograma.tpintegrador.Modelo.TrabajosTecnico;
import java.util.Set;
import lombok.Data;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
     
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name = "tecnico_especialidad",
        joinColumns = @JoinColumn(name = "tecnico_id"),
        inverseJoinColumns = @JoinColumn(name = "especialidad_id")
    )
    private Set<Especialidad> especialidades = new HashSet<>();
    
    
    
    
    private Set<TrabajosTecnico> trabajosPendientes;
    //tecnico en experiencia puntaje tiempo estimado  complejidad en clase programa


  



    public void agregarHabilidad(Especialidad especialidad) {
        especialidades.add(especialidad);
    }

    public void eliminarHabilidad(EspecialidadEnum especialidad) {
        especialidades.remove(especialidad);
    }

    public boolean tieneHabilidad(String problema) {
        
        return especialidades.contains(problema);
    }

    
    public void asignarNuevaHabilidad(Especialidad nuevaHabilidad) {
        agregarHabilidad(nuevaHabilidad);
        System.out.println("Al tecnico " + this.getNombre()+ " le ha sisdo asinada la Habilidad " + nuevaHabilidad);
    }
}
