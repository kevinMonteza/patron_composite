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
public class Television implements Componente{

    public Television(){}
    
    @Override
    public void add(Componente componente) {}

    @Override
    public String getDescripcion() {
        return  "Tipo mueble : Tele     Precio: "+this.getPrecio()+"<br/> "; 
    }

    @Override
    public Double getPrecio() {
      return 900.00; 
    }
    
}
