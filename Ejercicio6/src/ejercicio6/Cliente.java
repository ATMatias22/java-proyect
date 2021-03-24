/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Matias
 */
public class Cliente {
    
    private String dni;
    private String nombre;
    private TipoServicio tipoServicio;
    private ArrayList<Pelicula> registroPeliculas;

    public Cliente(String dni, String nombre, TipoServicio tipoServicio) {
        this.dni = dni;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        registroPeliculas = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }
    
    public void setTipoServicio(TipoServicio t){
        this.tipoServicio = t;
    }
    
    private int numRandom(){
        Random rnd = new Random();
        return rnd.nextInt(2);
    }
    
    public boolean esPremium(){
        boolean esPremium = false;
        if(tipoServicio == TipoServicio.PREMIUM){
            esPremium = true;
        }
        return esPremium;
    }
    
    public boolean clienteTieneEsteDni(String dni){
           boolean tieneEsteDni = false;
           
        if(this.dni.equalsIgnoreCase(dni)){
            tieneEsteDni = true;
        }
        
        return tieneEsteDni;
    }
    
    
    public void agregarPeliculaVista(Pelicula p){
        registroPeliculas.add(p);
    }
    
    public void recorrerPeliculasVistas(){
        for (Pelicula rp : registroPeliculas) {
            System.out.println(rp);
        }
    }
    
    public boolean esDeudor(){
        boolean esDeudor = false;
        if(numRandom() == 1){
            esDeudor = true;
        }
        
        return esDeudor;
    }
          

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", tipoServicio=" + tipoServicio + ", registroPeliculas=" + registroPeliculas + '}';
    }
    
    
    
    
    
    
    
       
    
}
