/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Matias
 */
public class Cliente {
    private String nombre;
    private int cantDias;

    public Cliente(String nombre, int cantDias) {
        this.nombre = nombre;
        this.cantDias = cantDias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantDias() {
        return cantDias;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cantDias=" + cantDias + '}';
    }
    
    
    
    
    
}
