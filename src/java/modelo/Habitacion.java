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
 * @author User
 */
public class Habitacion implements Componente {
    private String nombre;
    private List<Componente> componentes;

    public Habitacion(String nombre){
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }
     
    @Override
    public void add(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public String getDescripcion() {
        String descripcion = "Componente: " + this.nombre + "<br>";
        descripcion = this.componentes.stream().map((componente) -> componente.getDescripcion()).reduce(descripcion, String::concat);
        return descripcion;
    }

    @Override
    public Double getPrecio() {
        return null;
    }

}
