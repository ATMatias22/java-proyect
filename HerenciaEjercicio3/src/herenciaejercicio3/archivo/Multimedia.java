/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.archivo;

/**
 *
 * @author Matias
 */
public class Multimedia extends Archivo {

    private double duracion;
    private boolean estaEnPause;

    public Multimedia(String nombre, double peso, String localizacion, boolean estaAbierto, double duracion, boolean estaEnPause) {
        super(nombre, peso, localizacion, estaAbierto);
        this.duracion = duracion;
        this.estaEnPause = estaEnPause;
    }

    public double getDuracion() {
        return duracion;
    }

    public boolean isEstaEnPause() {
        return estaEnPause;
    }

    public void reproducir() {

        if (isEstaAbierto()) {
            if (estaEnPause) {
                System.out.println("Se empezo a reproducir el video");
                this.estaEnPause = false;
            } else {
                System.out.println("YA SE ESTA REPRODUCIENDO EL VIDEO NO REPRODUZCA");
            }
        } else {

            System.out.println("Primero habra el archivo para poder reproducir el video");
        }

    }

    public void parar() {

        if (isEstaAbierto()) {

            if (estaEnPause) {
                System.out.println("YA ESTA PAUSADO EL VIDEO NO PAUSEE DE NUEVO");
            } else {
                System.out.println("Se acaba de pausar el video");
                this.estaEnPause = true;
            }
        }else{
            System.out.println("Primero habra el archivo para poder parar el video");

        }

    }

}
