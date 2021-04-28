/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcos;

/**
 *
 * @author Matias
 */
public class Velero extends Barco{

    private int cantMastiles;
    private final static double VALOR_BASE = 500;
    private final static double VALOR_ADICIONAL = 100;

    public Velero(String matricula, double esloraEnMts, int anioDeFabricacion, String nomDuenio,int cantMastiles) {
        super(matricula, esloraEnMts, anioDeFabricacion, nomDuenio, VALOR_BASE, VALOR_ADICIONAL);
        this.cantMastiles = cantMastiles;
    }

    @Override
    public double getPrecioAdicional() {
        return VALOR_ADICIONAL*cantMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+ "\ncantMastiles=" + cantMastiles ;
    }

    
 


 
   
    
    
    
}
