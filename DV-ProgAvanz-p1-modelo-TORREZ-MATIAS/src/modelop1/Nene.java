/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelop1;

/**
 *
 * @author Matias
 */
public class Nene extends Cliente {

    public final static int EDAD_MINIMA = 6;
    public final static int DESCUENTO_POR_ANIO = 5;
    private int edad;

    public Nene(String DNI, String apellido, int edad) {
        super(DNI, apellido);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public double getDescuento(){
        double total = EDAD_MINIMA - edad ;
        return total;
                
    }
    
    

   
    

}
