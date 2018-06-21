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
 * @author kevinMC
 */
public class Edificada implements Componente{
     private String nombre;
    private List<Componente> componentes;

    public Edificada(String nombre) {
        this.nombre = nombre;
        componentes = new ArrayList<>();
    }
    
    @Override
    public void add(Componente componente) {
       componentes.add(componente);
    }

    @Override
    public String getDescripcion() {
        String descripcion = "Tipo Instalacion:  " + this.nombre+"<br>";
        descripcion = this.componentes.stream().map((componente) -> componente.getDescripcion()).reduce(descripcion, String::concat);
        return descripcion;
    }

    @Override
    public Double getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
