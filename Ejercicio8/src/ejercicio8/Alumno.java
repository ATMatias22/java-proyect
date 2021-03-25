/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Alumno {
    
    private String nombre;
    private String mail;
    private ArrayList <Materia> materiasAprobadas;

    public Alumno(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }
    
    public void agregarMateriaAprobada(Materia m){
        if(m.esAprobado()){
            materiasAprobadas.add(m);
        }
    }
    
    public int cuantasMateriasAprobadas(){
        return materiasAprobadas.size();
    }
    
    public double obtenerPromedio(){
        double total = 0;
        for (Materia m : materiasAprobadas) {
            total += m.getNotaFinal();
        }
        return cuantasMateriasAprobadas() != 0 ? total/cuantasMateriasAprobadas() : 0;
    }
    
    public boolean esCandidato(double prom,int materiasAprobadas){
        return obtenerPromedio() >= prom && cuantasMateriasAprobadas() >=  materiasAprobadas;
    }
    
  
}
