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
public class Pase extends ConDemora {

    private final static String DESCRIPCION_PASE = "Solo acepto pagos atraves de Pase, tengo un descuento de 12 a 15%";
    private final static int DESCUENTO_HASTA_5_DIAS = 15;
    private final static int DESCUENTO_MAYOR_A_5_DIAS = 12;

    public Pase(int diasDeDemoraEnElCobro) {
        super(DESCRIPCION_PASE, diasDeDemoraEnElCobro <= 5 ? DESCUENTO_HASTA_5_DIAS : DESCUENTO_MAYOR_A_5_DIAS, diasDeDemoraEnElCobro);
    }
 

  
}
