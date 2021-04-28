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
public class EmbarcacionDeportivaAMotorDeLujo extends EmbarcacionDeportivaAMotor{
    
    public EmbarcacionDeportivaAMotorDeLujo(String matricula, double esloraEnMts, int anioDeFabricacion, String nomDuenio, int potenciaEnHp, int factorAerodinamico) {
        super(matricula, esloraEnMts, anioDeFabricacion, nomDuenio, potenciaEnHp, factorAerodinamico);
    }

    @Override
    public double calcularConsumo(){
        return 2*getPotenciaEnHp()*getINDICE_CALC_POTENCIA();
    }
    
    
    
    
    
}
