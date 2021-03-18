/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Matias
 */
public class Evaluacion {
    
    private TipoExamen tipo;
    private double nota;

    public Evaluacion(TipoExamen tipo, double nota) {
        this.tipo = tipo;
        this.nota = nota;
    }

    public TipoExamen getTipo() {
        return tipo;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "tipo=" + tipo + ", nota=" + nota + '}';
    }
    
    
    
    
    
    
    
}
