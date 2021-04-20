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
public class Pase extends ConDemora {
    private final static int DIA_DE_ESPERA = 5;
    private final static String DESCRIPCION_PASE = "Solo acepto pagos atraves de Pase, tengo un descuento de 12 a 15%";
    private final static double DESCUENTO_MENOR_A_XDIAS = 0.15;
    private final static double DESCUENTO_MAYOR_A_XDIAS = 0.12;

    public Pase(int diasDeDemoraEnElCobro) {
        super(DESCRIPCION_PASE, diasDeDemoraEnElCobro);
    }

    @Override
    public double getDescuento() {
        return this.getDiasDeDemoraEnElCobro() < DIA_DE_ESPERA ? DESCUENTO_MENOR_A_XDIAS : DESCUENTO_MAYOR_A_XDIAS ;
    }
 

  
}
