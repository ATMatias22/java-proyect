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
public class Bebida extends Producto {
    
    private double cmCubicos;
    private boolean tieneAlcohol;

    public Bebida(double cmCubicos, boolean tieneAlcohol, String nombre, double precio) {
        super(nombre, precio);
        this.cmCubicos = cmCubicos;
        this.tieneAlcohol = tieneAlcohol;
    }

    public double getCmCubicos() {
        return cmCubicos;
    }

    public boolean isTieneAlcohol() {
        return tieneAlcohol;
    }

    @Override
    public String toString() {
        return super.toString()+"\ncmCubicos=" + cmCubicos + "\nTieneAlcohol=" + tieneAlcohol ;
    }
    
    
    
    
    
}
