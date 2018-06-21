/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author kevinMC
 */
public class Empotrada implements Componente{

    @Override
    public void add(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescripcion() {
        return "Tipo Instalacion:  Empotrada &nbsp;&nbsp;  precio:"+this.getPrecio()+"<br>";
    }

    @Override
    public Double getPrecio() {
        return 1200.00;
    }
    
}
