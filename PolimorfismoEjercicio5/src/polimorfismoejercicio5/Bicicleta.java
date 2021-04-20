/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio5;

/**
 *
 * @author Matias
 */
public class Bicicleta {
    private final static int LIMITE_EN_KM = 2000;
    private String marca;
    private String modelo;
    private double cantKm;

    public Bicicleta(String marca, String modelo, double cantKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantKm = cantKm;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCantKm() {
        return cantKm;
    }
    
    public boolean sePuedeAgarrar(){
        return this.cantKm < 2000;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", modelo=" + modelo + ", cantKm=" + cantKm + '}';
    }
    
    
    
    
    
    
}
