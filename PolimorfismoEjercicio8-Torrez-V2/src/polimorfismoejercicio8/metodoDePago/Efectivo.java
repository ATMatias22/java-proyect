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
public class Efectivo extends MetodoDePago{
    private final static String DESCRIPCION_EFECTIVO = "Solo acepto pagos atraves de Efectivo, no posee descuentos por el momento";
    private final static int DESCUENTO_EFECTIVO = 0;
    public Efectivo() {
        super(DESCRIPCION_EFECTIVO);
    }

    @Override
    public double getDescuento() {
        return DESCUENTO_EFECTIVO;
    }


}
