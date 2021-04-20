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
public class Camion extends Vehiculo{
    
    private final static double TARIFA_CAMION = 200;
    
    public Camion(String patente) {
        super(patente, TARIFA_CAMION);
    }


    
}
