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
public abstract class Vehiculo {
    private String patente;
    private double tarifa;

    public Vehiculo(String patente, double tarifa) {
        this.patente = patente;
        this.tarifa = tarifa;
    }

    public String getPatente() {
        return patente;
    }

    public double getTarifa() {
        return tarifa;
    }
    
}
