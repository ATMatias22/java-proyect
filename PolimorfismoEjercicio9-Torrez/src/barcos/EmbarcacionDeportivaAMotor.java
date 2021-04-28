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
public class EmbarcacionDeportivaAMotor extends Barco {

    private int potenciaEnHp;
    private int factorAerodinamico;
    private final static double INDICE_CALC_POTENCIA = 0.35;
    private final static double VALOR_BASE = 1000;
    private final static double VALOR_ADICIONAL = 300;


    public EmbarcacionDeportivaAMotor(String matricula, double esloraEnMts, int anioDeFabricacion, String nomDuenio,int potenciaEnHp, int factorAerodinamico) {
        super(matricula, esloraEnMts, anioDeFabricacion, nomDuenio, VALOR_BASE, VALOR_ADICIONAL);
        this.potenciaEnHp = potenciaEnHp;
        this.factorAerodinamico = factorAerodinamico;
    }

    public int getPotenciaEnHp() {
        return potenciaEnHp;
    }

    public int getFactorAerodinamico() {
        return factorAerodinamico;
    }

    public static double getINDICE_CALC_POTENCIA() {
        return INDICE_CALC_POTENCIA;
    }
    
    @Override
    public double getPrecioAdicional() {
        return VALOR_ADICIONAL * (potenciaEnHp*0.50);
    }

    public double calcularConsumo(){
        return this.potenciaEnHp/this.factorAerodinamico*INDICE_CALC_POTENCIA;
    }

    @Override
    public String toString() {
        return super.toString()+"\npotenciaEnHp=" + potenciaEnHp + "\nfactorAerodinamico=" + factorAerodinamico ;
    }
    
    
    
    
 
 
   
    
}
