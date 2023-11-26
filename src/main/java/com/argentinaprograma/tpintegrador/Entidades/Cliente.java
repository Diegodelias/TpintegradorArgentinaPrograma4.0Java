/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Entidades;

import com.argentinaprograma.tpintegrador.Modelo.Persona;

import java.util.HashSet;
import java.util.Set;
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
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")

public class Cliente  {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="cliente_id", referencedColumnName="id")*/
    /* @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name = "cliente_servicio",
        joinColumns = @JoinColumn(name = "cliente_id"),
        inverseJoinColumns = @JoinColumn(name = "servicio_id")
    )*/
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Servicio> servicios = new HashSet<>();
    private String razonSocial;
    private String CUIT;
    private boolean notificadoIncidente;
    
    


    
     public void agregarServicio(Servicio servicio) {
     
         servicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio) {
        servicios.remove(servicio);
    }

    public boolean tieneHabilidad(Servicio servicio) {
        return servicios.contains(servicio);
    }

    
    public void asignarNuevoServicio(Servicio servicio) {

        this.agregarServicio(servicio);
        System.out.println("El cliente " + this.getNombre()+ " cuenta con los siguiente servicios " + servicio);
    }
    
    
}
