/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12.fuentes;

/**
 *
 * @author Matias
 */
public class FuenteDeMarcado extends Fuente{

    private final static double CONSTANTE = 450;
    private double tamanioArchivo;

    public FuenteDeMarcado(double tamanioArchivo, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.tamanioArchivo = tamanioArchivo;
    }
    
    @Override
        public double indiceCalidad() {
            return this.tamanioArchivo != 0 ? CONSTANTE/this.tamanioArchivo : 0;
    }
    
}
