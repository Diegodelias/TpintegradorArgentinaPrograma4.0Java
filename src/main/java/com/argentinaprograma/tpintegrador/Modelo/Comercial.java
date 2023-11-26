/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpintegrador.Modelo;

import com.argentinaprograma.tpintegrador.Entidades.Incidente;
import com.argentinaprograma.tpintegrador.Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Comercial extends Sector {
    
      private List<Cliente> listaCliente = new ArrayList<>();

    public Comercial(String nombre) {
        super(nombre);
    }

    @Override
    public void procesarIncidente(Incidente incidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
      public void altaCliente(Cliente cliente){
        List<Cliente> listaCliente = this.listaCliente;
        listaCliente.add(cliente);
      }
    
     public void bajaCliente(Cliente cliente){
    
    }
     
     
   public void ModificacioCliente(Cliente cliente){
    
    }
      public List<Cliente> obtenerTodosLosClientes(){
   
       return this.listaCliente;
   }
}
