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
public class Mueble implements Componente{

    public Mueble(){}
    
    @Override
    public void add(Componente componente) {}

    @Override
    public String getDescripcion() {
        return "Tipo Mobiliario: mueble  &nbsp;&nbsp;  Precio:"+this.getPrecio()+"<br> ";
    }

    @Override
    public Double getPrecio() {
       return 234.56;
    }
    
}
