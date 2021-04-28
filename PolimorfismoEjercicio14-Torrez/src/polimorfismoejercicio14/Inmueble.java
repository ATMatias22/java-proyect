/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio14;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Inmueble {
   
    private String domiclio;
    private double superficieEnM2;
    private int cantAmbientes;
    private double precioEnDolares;
    private ArrayList<Notificable> interesados;

    public Inmueble(String domiclio, double superficieEnM2, int cantAmbientes, double precioEnDolares) {
        this.domiclio = domiclio;
        this.superficieEnM2 = superficieEnM2;
        this.cantAmbientes = cantAmbientes;
        this.precioEnDolares = precioEnDolares;
        this.interesados = new ArrayList<>();
    }
    
    public void agregarInteresado(Notificable i){
        this.interesados.add(i);
    }
    
    public void setPrecio(double p){
        mandarMensaje(p);
        this.precioEnDolares = p;
    }
    
    private String mensajeAMandarConNuevoPrecio(double p){
                System.out.println("------------------------------");

        return "El inmueble: \nDomicilio: "+this.domiclio+
                "\nSuperficie en M2: "+this.superficieEnM2 +
                "\nCantidad de ambientes: "+this.cantAmbientes+
                "\nPrecio en USD: "+this.precioEnDolares+ "\nPor el que "
                + "ha mostrado interes cambio su precio de: $"+this.precioEnDolares+ " a $"+ p ;
    }
    
    private void mandarMensaje(double p){
        for (Notificable i : interesados) {
            i.recibirMensaje(mensajeAMandarConNuevoPrecio(p));
        }
    }
    
    
 
    
}
