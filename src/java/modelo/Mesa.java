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
public class Mesa implements Componente{
    
    public Mesa(){}

    @Override
    public void add(Componente componente) {}

    @Override
    public String getDescripcion() {
        return  "Nombre : mesa    &nbsp;&nbsp;  Precio: "+this.getPrecio()+"<br> ";
    }

    @Override
    public Double getPrecio() {
        return 12.34; //To change body of generated methods, choose Tools | Templates.
    }
    
}
