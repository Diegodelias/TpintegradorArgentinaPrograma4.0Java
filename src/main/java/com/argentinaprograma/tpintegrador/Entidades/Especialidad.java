/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private int especialidadPuntaje;
 
    
    @ManyToMany(mappedBy = "especialidades")
    private List<Tecnico> tecnicos = new ArrayList<>();
   
     
      public void agregarTecnico(Tecnico tecnico) {
        tecnicos.add(tecnico);
        tecnico.getEspecialidades().add(this); }
      
       public void removerTecnico(Tecnico tecnico) {
        tecnicos.remove(tecnico);
        tecnico.getEspecialidades().remove(this);
    }
    
}
