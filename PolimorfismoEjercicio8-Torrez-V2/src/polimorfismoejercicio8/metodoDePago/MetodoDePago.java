/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8.metodoDePago;

/**
 *
 * @author Matias
 */
public abstract class MetodoDePago {
    private String descripcion;
  

    public MetodoDePago(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double getDescuento();

  
  
    
    
    
    
    
}
