/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author Matias
 */
public class Materia {
    
    private String nombre;
    private double notaFinal;
    private double notaParaAprobar;

    public Materia(String nombre, double notaFinal, double notaParaAprobar) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
        this.notaParaAprobar = notaParaAprobar;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public double getNotaParaAprobar() {
        return notaParaAprobar;
    }
    
    
    
    public boolean esAprobado(){
        return notaFinal >= notaParaAprobar ;
    }
    
    
    
    
    
}
