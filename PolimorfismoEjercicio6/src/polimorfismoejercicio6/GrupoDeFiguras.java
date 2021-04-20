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
public abstract class GrupoDeFiguras {
    private String color;

    public GrupoDeFiguras(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimetro();
    public void mostrarInfoDeFiguras(){
        System.out.println("Area: "+area()
        +"\nPerimetro: "+ perimetro()
        +"\nColor: "+color);
        System.out.println("---------------------------------------");
    }
    
}
