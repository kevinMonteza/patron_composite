/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LABO08
 */
public class Silla implements Componente{
    
    public Silla(){}
    
    @Override
    public void add(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescripcion() {
        return "Tipo mobiliario : silla    &nbsp;&nbsp;   Precio: "+this.getPrecio()+"\n "; 
    }

    @Override
    public Double getPrecio() {
       return 34.56;
    }
    
}
