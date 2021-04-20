/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.archivo;

/**
 *
 * @author Matias
 */
public class Archivo {
 private String nombre;
 private double peso;
 private String localizacion;
 private boolean estaAbierto;

    public Archivo(String nombre, double peso, String localizacion, boolean estaAbierto) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.estaAbierto = estaAbierto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public boolean isEstaAbierto() {
        return estaAbierto;
    }
    
    public void cambiarNombreAlArchivo(String nombre){
        this.nombre = nombre;
    }
    
  
    public void moverUbicacion(String u){
        this.localizacion = u;
        System.out.println("Se movio el archivo correctamente");
    }
    
    public void abrirArchivo(){
        if(this.estaAbierto){
            System.out.println("Su archivo ya esta abierto, pero lo abrimos otra ves");
        }else{
            System.out.println("Acabamos de abrir el archivo");
            this.estaAbierto = true;
        }
       
    }
    
    public void cerrarArchivo(){
        if(!this.estaAbierto){
            System.out.println("El archivo no esta abierto");
        }else{
            System.out.println("Acabamos de cerrar su archivo");
            this.estaAbierto = false;
        }
        
    }
  
 
 
    
}
