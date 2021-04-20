/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.archivo;

import herenciaejercicio3.musica.FormatoVideo;

/**
 *
 * @author Matias
 */
public class Video extends Multimedia{
    
    private FormatoVideo formato;
    private int ancho;
    private int alto;

    public Video(String nombre, double peso, String localizacion, boolean estaAbierto, double duracion, boolean estaEnPause,FormatoVideo formato, int ancho, int alto) {
        super(nombre, peso, localizacion, estaAbierto, duracion, estaEnPause);
        this.formato = formato;
        this.ancho = ancho;
        this.alto = alto;
    }

    public FormatoVideo getFormato() {
        return formato;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public String toString() {
        return "Video:"
                +"\nNombre: "+getNombre()
                +"\nPeso: "+ getPeso()
                +"\nLocalizacion: "+ getLocalizacion()
                +"\nAbierto: "+isEstaAbierto()
                +"\nDuracion: "+getDuracion()
                +"\nPause: "+isEstaEnPause()
                +"\nFormato: "+this.formato
                +"\nAlto: "+this.alto+"px"
                +"\nAncho: "+this.ancho+"px";
    }
    
    
    
    
    
    
    
    
}
