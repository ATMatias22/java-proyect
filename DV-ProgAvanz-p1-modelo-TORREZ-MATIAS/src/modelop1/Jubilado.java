/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelop1;

/**
 *
 * @author Matias
 */
public class Jubilado extends Cliente{
    
    public final static double DESCUENTO = 30;
    private Genero genero;

    public Jubilado(String DNI, String apellido, Genero genero) {
        super(DNI, apellido);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }
    
    @Override
    public double getDescuento(){
        return DESCUENTO;
    }
    
    
}
