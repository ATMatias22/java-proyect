/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio5;

/**
 *
 * @author Matias
 */
public class BicicletaElectrica extends Bicicleta{
    
    private static final int LIMITE_WATTS = 250;
    private int potenciaEnWatts;
    
    public BicicletaElectrica(String marca, String modelo, double cantKm,int potenciaEnWatts) {
        super(marca, modelo, cantKm);
        this.potenciaEnWatts = potenciaEnWatts;
    }
    
    @Override
    public boolean sePuedeAgarrar(){
        return this.potenciaEnWatts < 250;
    }

    @Override
    public String toString() {
        return super.toString()+" BicicletaElectrica{" + "potenciaEnWatts=" + potenciaEnWatts + '}';
    }

    
    
 
    
    
}
