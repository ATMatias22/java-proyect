/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Matias
 */
public class Pelicula {
    
    private String nombre;
    private int duracion;
    private TipoServicio tipoPelicula;

    public Pelicula(String nombre, int duracion, TipoServicio tipoPelicula) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipoPelicula = tipoPelicula;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }
  
    public TipoServicio getTipoPelicula() {
        return tipoPelicula;
    }
    
      
    public boolean esPremium(){
        boolean esPremium = false;
        if(tipoPelicula == TipoServicio.PREMIUM ){
            esPremium = true;
        }
        return esPremium;
    }
    
    public boolean tieneEsteNombre(String nombre){
        boolean tieneEsteNombre = false;
        
        if(this.nombre.equalsIgnoreCase(nombre)){
            tieneEsteNombre = true;
        }
        
        return tieneEsteNombre;
        
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", tipoPelicula=" + tipoPelicula + '}';
    }
    
    
    
    
    
    
    
}
