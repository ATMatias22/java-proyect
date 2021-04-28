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
public class Inmobiliaria implements Notificable {

    public final static double PORCENTAJE_COMISION = 3;
    private String nombre;
    private String mail;
    private ArrayList<Inmueble> inmuebles;

    public Inmobiliaria(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
        this.inmuebles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }
    
    public void agregarInmueble(Inmueble i){
        this.inmuebles.add(i);
    }

    @Override
    public void recibirMensaje(String m) {
        System.out.println("Hemos recibido un mail a nuestra casilla " + this.mail + " con el mensaje: \n" + m);

    }

}
