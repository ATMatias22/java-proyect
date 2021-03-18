/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Matias
 */
public class Vehiculo {
    
    private String nombre;
    private double precio;
    private Tipo tipo;
    private Marca marca;

    public Vehiculo(String nombre, double precio, Tipo tipo, Marca marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", marca=" + marca + '}';
    }
    
    
    
    
    
    
    
}
