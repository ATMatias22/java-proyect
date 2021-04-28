/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10.servicios;

import polimorfismoejercicio10.Matematica;

/**
 *
 * @author Matias
 */
public class ServicioDeReparacion extends Servicio{
    
    public static final double PRECIO_HORA = 180;
    private static final int DIFICULTAD_MAYOR_A = 3;
    private static final double INCREMENTO_DE_PRECIO_POR_DIFICULTAD = 25;
    private int nroDificultad;

    public ServicioDeReparacion(int cantHoras, int nroDificultad) {
        super(cantHoras);
        this.nroDificultad = nroDificultad;
    }

    public int getNroDificultad() {
        return nroDificultad;
    }
    
    public boolean esDificultadMenorA(int n){
        return this.nroDificultad < n;
    }

    private boolean esDificultadMayorA(){
         if(this.nroDificultad < 0){
             this.nroDificultad = 0;
         }
        return this.nroDificultad > DIFICULTAD_MAYOR_A;
    }
    
    @Override
    public double getPrecioHora() {
        return PRECIO_HORA;
    }
    
    @Override
    public double costoDelProducto() {
        return esDificultadMayorA() ? Matematica.sumarPorcentaje(super.costoDelProducto(), INCREMENTO_DE_PRECIO_POR_DIFICULTAD) : super.costoDelProducto();
    }

}
