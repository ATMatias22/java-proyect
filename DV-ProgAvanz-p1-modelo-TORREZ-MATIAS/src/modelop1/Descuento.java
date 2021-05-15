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
public class Descuento {
    
    public static double descuento(double cantidad, double descuento){
        
        return cantidad - ((cantidad*descuento)/100);
        
    }
    
}
