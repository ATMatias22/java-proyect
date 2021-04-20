/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.musica;

/**
 *
 * @author Matias
 */
public class Album {
    private String nombre;
    private int anio;
    private int cantidadCanciones;

    public Album(String nombre, int anio, int cantidadCanciones) {
        this.nombre = nombre;
        this.anio = anio;
        this.cantidadCanciones = cantidadCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }
    
    
    
}
