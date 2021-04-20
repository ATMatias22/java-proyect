/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.time.LocalDate;

/**
 *
 * @author Matias
 */
public class Adicional {
    
    private int precio;
    private LocalDate fechaPrestacion;
    private Tipo tipo;

    public Adicional(int precio, LocalDate fechaPrestacion, Tipo tipo) {
        this.precio = precio;
        this.fechaPrestacion = fechaPrestacion;
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public LocalDate getFechaPrestacion() {
        return fechaPrestacion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Adicional{" + "precio=" + precio + ", fechaPrestacion=" + fechaPrestacion + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
}
