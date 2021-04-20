/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Usuario {
    
    private String nombre;
    private double seniaAPagar;
    private ArrayList<Bloque> bloquesElegidos;

    public Usuario() {
     
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getSeniaAPagar() {
        return seniaAPagar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeniaAPagar(double seniaAPagar) {
        this.seniaAPagar = seniaAPagar;
    }

 
    
    
    
    
    
    
    
}
