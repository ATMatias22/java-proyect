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
public class Curso {

    private String codigo;
    private String titulo;
    private int cantHoras;
    private ArrayList<Alumno> alumnos;


    public Curso(String codigo, String titulo, int cantHoras) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cantHoras = cantHoras;
        this.alumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno a){
        alumnos.add(a);
        
    }
    
    public void imprimirAlumnosPorEncimaDe(double promedio){
        ArrayList <Alumno> aux = buscarAlumnosPorEncimaDe(promedio);
        
        if(aux == null){
            
            System.out.println("No se encontraron Alumnos en el curso");
            
        }else if (aux.size() <= 0){
            
            System.out.println("Ninguno Alumno Pudo Superar el Promedio");
            
        }else{
            for (Alumno alumno : aux) {
                System.out.println("EL alumno: "+alumno.getNombre()+ " supero el promedio con: "+ alumno.calcularPromedio());
                System.out.println(alumno);
                
            }
        }
        
        
        
    }
    
    
    public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double promedio){
        
        ArrayList <Alumno> aux = null;
        if(hayAlumnos()){
            aux = new ArrayList<>();
        }else{
            //System.out.println("No hay Alumnos en esta cursada");
            return aux;
        }
        for (Alumno a : alumnos) {
            if(a.calcularPromedio() > promedio && a.getEvaluaciones().size() >= 2 ){
               // System.out.println(a.getNombre()+" supero el promedio de: "+ promedio+" con: "+a.calcularPromedio());
                aux.add(a);
            }
        }
        
       /* if(aux.size() == 0){
            System.out.println("No se encontraron alumnos con promedio encima de: "+ promedio);
        }
*/
        return aux;
        
    }
    
    private boolean hayAlumnos(){
        
        if(alumnos.size() > 0){
            return true;
        } 
        
        return false;
        
        
        
    }
    

    
}
