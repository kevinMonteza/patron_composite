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
public interface Componente {

    public void add(Componente componente);

    public String getDescripcion();

    public Double getPrecio();
}
