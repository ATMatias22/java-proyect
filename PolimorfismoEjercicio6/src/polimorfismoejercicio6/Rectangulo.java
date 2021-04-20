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
public class Rectangulo extends GrupoDeFiguras{

    private double b;
    private double h;
    
    public Rectangulo(double b, double h, String color) {
        super(color);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    
    @Override
    public double area() {
        return this.b * this.h;
    }

    @Override
    public double perimetro() {
        return this.b*2 + this.h*2;
    }
    
}
