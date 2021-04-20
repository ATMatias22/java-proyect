/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;

/**
 *
 * @author Matias
 */

public class Moto extends Vehiculo{
    
    private final static double TARIFA_MOTO = 120;
    
    public Moto(String patente) {
        super(patente, TARIFA_MOTO);
    }

    
}
