/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABO08
 */
public class Instalacion implements Componente{
    private String nombre;
    List<Componente> componentes;
    
    public Instalacion(String nombre){
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }
    
    @Override
    public void add(Componente componente) {
        this.componentes.add(componente);
    }

    @Override
    public String getDescripcion() {
      String descripcion = this.nombre + "<br> ";
      descripcion = this.componentes.stream().map((componente) -> componente.getDescripcion()).reduce(descripcion, String::concat);
        return descripcion;
    }

    @Override
    public Double getPrecio() {
        return null;
    }
    
}
