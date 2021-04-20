/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;

/**
 *
 * @author Matias
 */
public abstract class MetodoDePago {
    private String descripcion;
    private int descuento;

    public MetodoDePago(String descripcion, int descuento) {
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return "MetodoDePago{" + "descripcion=" + descripcion + ", descuento=" + descuento + '}';
    }
  
    
    
    
    
    
}
