/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio6;

/**
 *
 * @author Matias
 */
public class TrianguloEquilatero extends GrupoDeFiguras{
    
    private double lado;

    public TrianguloEquilatero(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public double area() {
        
        return (Math.sqrt(3)/4)*Math.pow(this.lado,2);
    }

    @Override
    public double perimetro() {
        return 3*this.lado;
    }
    
    
    
}
