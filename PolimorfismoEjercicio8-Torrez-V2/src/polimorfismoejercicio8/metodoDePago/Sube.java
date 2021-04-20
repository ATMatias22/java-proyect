/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8.metodoDePago;

/**
 *
 * @author Matias
 */
public class Sube extends ConDemora {

    private final static double DESCUENTO_SUBE = 0.10;
    private final static String DESCRIPCION_SUBE = "Solo acepto pagos atraves de sube, tengo un descuento del 10%";

    public Sube(int diasDeDemoraEnElCobro) {
        super(DESCRIPCION_SUBE,diasDeDemoraEnElCobro);
    }

    @Override
    public double getDescuento() {
        return DESCUENTO_SUBE;
    }
    
    

  
    
    
    

  
}
