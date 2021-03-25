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
public class Carrera {

    private ArrayList<Alumno> alumnos;
    private static final int MAX_CANDIDATOS = 20;
    private static final int CANTIDAD_MATERIA_APROBADAS = 5;

    public Carrera() {
        this.alumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
        
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }

    public ArrayList<AlumnoCandidato> obtenerCandidatos(double prom) {
        int i = 0;
        ArrayList<AlumnoCandidato> candidatos = new ArrayList<>();
        while (candidatos.size() < MAX_CANDIDATOS && i < cantidadAlumnos()) {
            Alumno aux = alumnos.get(i);
            if (aux.esCandidato(prom, CANTIDAD_MATERIA_APROBADAS)) {
                candidatos.add(new AlumnoCandidato(aux.getNombre(), aux.getMail()));
            }
            i++;
        }
        return candidatos;
    }

}
