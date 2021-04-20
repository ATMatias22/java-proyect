/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Habitacion {
    
    private int numero;
    private double precio;
    private boolean estaOcupada;
    private Cliente cliente;
    private ArrayList<Adicional> adicionales;

 

    public Habitacion(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
        this.estaOcupada = false;
        adicionales = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }
    
    
    public void agregarCliente(Cliente c){
        this.cliente = c;
        this.estaOcupada = true;
    }
    
    public void quitarCliente(){
        this.cliente = null;
                this.estaOcupada = false;

    }
    
    public void agregarAdicional(Adicional a){
        adicionales.add(a);
    }
    
    public boolean existeHabitacion(int n){
        return n == this.numero;
    }
    
    public double obtenerTotalAdicionales(){
        double total = 0;
        for (Adicional a : adicionales) {
            total += a.getPrecio();
        }
        return total;
    }
    
    public double calcularTotal(){
        return (this.precio*cliente.getCantDias())+obtenerTotalAdicionales();
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", precio=" + precio + ", estaOcupada=" + estaOcupada + ", cliente=" + cliente + ", adicionales=" + adicionales + '}';
    }

    
    
    
    
    
    
    
}
