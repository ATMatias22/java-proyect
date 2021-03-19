/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Matias
 */
public class Propiedad {
    
    private String domicilio;
    private double precio;
    private Tipo tipo;

    public Propiedad(String domicilio, double precio, Tipo tipo) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public double getPrecio() {
        return precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "domicilio=" + domicilio + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
