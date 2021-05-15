/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13.menu;

/**
 *
 * @author Matias
 */
public class Plato extends Producto{
    
    private String descripcion;
    private boolean esVegano;
    private boolean esParaCeliacos;

    public Plato(String descripcion, boolean esVegano, boolean esParaCeliacos, String nombre, double precio) {
        super(nombre, precio);
        this.descripcion = descripcion;
        this.esVegano = esVegano;
        this.esParaCeliacos = esParaCeliacos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEsVegano() {
        return esVegano;
    }

    public boolean isEsParaCeliacos() {
        return esParaCeliacos;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndescripcion=" + descripcion + "\nesVegano=" + esVegano + "\nesParaCeliacos=" + esParaCeliacos ;
    }
    
    
    
    
    
    
}
