/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio9.torrez;

import barcos.*;

/**
 *
 * @author Matias
 */
public class Amarra {

    private int id;
    private String ubicacion;
    private Barco barco;

    public Amarra(int id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.barco = null;
    }

    
    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean estaDisponible() {
        return this.barco == null;
    }

    public Barco getBarco() {
        return barco;
    }
    
    
    

    public void alquilar(Barco b) {
        if (estaDisponible()) {
            this.barco = b;
            System.out.println("Se acaba de alquilar la amarra");
        } else {
            System.out.println("Ya esta ocupado");
        }
    }

    public void desalojar() {
        if (!estaDisponible()) {
            this.barco = null;
            System.out.println("se acaba de deesalojar al barco");
        } else {
            System.out.println("No hay nadie a quien deesalojar");
        }
    }

    public boolean elBarcoEsMayorAlPrecio(double p) {
        return !estaDisponible() ? this.barco.total() > p : false;
    }

    public boolean elBarcoEsDeportivo() {
        return this.barco instanceof EmbarcacionDeportivaAMotor;
    }

    public double consumoDelBarco() {
        return !estaDisponible() && elBarcoEsDeportivo() ? ((EmbarcacionDeportivaAMotor) this.barco).calcularConsumo() : 0;

    }

}
