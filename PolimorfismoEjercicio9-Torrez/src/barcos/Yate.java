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
public class Yate extends Barco{

    private int cantCamarotes;
        private final static double VALOR_BASE = 600;
    private final static double VALOR_ADICIONAL = 100;


    public Yate(String matricula, double esloraEnMts, int anioDeFabricacion, String nomDuenio, int cantCamarotes) {
        super(matricula, esloraEnMts, anioDeFabricacion, nomDuenio, VALOR_BASE, VALOR_ADICIONAL);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double getPrecioAdicional() {
        return VALOR_ADICIONAL * cantCamarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"cantCamarotes=" + cantCamarotes ;
    }
    
    


  
  
    
  
  
    
}
