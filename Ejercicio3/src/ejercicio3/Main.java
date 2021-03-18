/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import org.w3c.dom.events.Event;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Academia a = new Academia();
        Curso java = new Curso("A1", "JAVA", 100);
        Curso python = new Curso("B1", "PYTHON", 100);
        Curso php = new Curso("C1", "PHP", 100);

        a.agregarCurso(java);
        a.agregarCurso(python);
        a.agregarCurso(php);

        Evaluacion e = new Evaluacion(TipoExamen.EXAMEN_FINAL, 5);
        Evaluacion e1 = new Evaluacion(TipoExamen.PRIMER_EXAMEN, 4);
        Evaluacion e2 = new Evaluacion(TipoExamen.SEGUNDO_EXAMEN, 7);

        Evaluacion e3 = new Evaluacion(TipoExamen.EXAMEN_FINAL, 10);
        Evaluacion e4 = new Evaluacion(TipoExamen.PRIMER_EXAMEN, 2);
        Evaluacion e5 = new Evaluacion(TipoExamen.SEGUNDO_EXAMEN, 3);

        Evaluacion e6 = new Evaluacion(TipoExamen.EXAMEN_FINAL, 9);
        Evaluacion e7 = new Evaluacion(TipoExamen.PRIMER_EXAMEN, 8);
        Evaluacion e8 = new Evaluacion(TipoExamen.SEGUNDO_EXAMEN, 10);

        Alumno alum = new Alumno("Pepe", "11111111");
        Alumno alum1 = new Alumno("Meme", "22222222");
        Alumno alum2 = new Alumno("Cece", "33333333");

        alum.agregarEvaluacion(e);
        alum.agregarEvaluacion(e1);
        alum.agregarEvaluacion(e2);

        alum1.agregarEvaluacion(e3);
        alum1.agregarEvaluacion(e4);
        alum1.agregarEvaluacion(e5);

        alum2.agregarEvaluacion(e6);
        alum2.agregarEvaluacion(e7);
        alum2.agregarEvaluacion(e8);

        java.agregarAlumno(alum);
        python.agregarAlumno(alum1);
        java.agregarAlumno(alum2);

   
        
        double promedioEsperado = 10;
        
      java.imprimirAlumnosPorEncimaDe(promedioEsperado);
      python.imprimirAlumnosPorEncimaDe(promedioEsperado);
      php.imprimirAlumnosPorEncimaDe(promedioEsperado);
        
      //  java.buscarAlumnosPorEncimaDe(promedioEsperado);

    }

}
