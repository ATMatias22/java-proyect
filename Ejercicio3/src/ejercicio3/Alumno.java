/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Alumno {

    private String nombre;
    private String dni;
    private ArrayList<Evaluacion> evaluaciones;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.evaluaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    public void agregarEvaluacion(Evaluacion e){
        
        evaluaciones.add(e);
        
    }
    

    private double totalNotas(){
        double total = 0;
        for (Evaluacion e : evaluaciones) {
            total += e.getNota();
        }
        return total;
    }
    
    public double calcularPromedio(){
     
       return totalNotas()/this.evaluaciones.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", evaluaciones=" + evaluaciones + '}';
    }

}
