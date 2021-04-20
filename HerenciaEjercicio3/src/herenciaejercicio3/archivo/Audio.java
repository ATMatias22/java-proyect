/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.archivo;

import herenciaejercicio3.musica.Artista;
import herenciaejercicio3.musica.FormatoAudio;
import herenciaejercicio3.musica.Album;

/**
 *
 * @author Matias
 */
public class Audio extends Multimedia{
    
    private FormatoAudio formato;
    private Artista artista;
    private Album album;

    public Audio(String nombre, double peso, String localizacion, boolean estaAbierto, double duracion, boolean estaEnPause,FormatoAudio formato, Artista artista, Album album) {
        super(nombre, peso, localizacion, estaAbierto, duracion, estaEnPause);
        this.formato = formato;
        this.artista = artista;
        this.album = album;
    }

    public FormatoAudio getFormato() {
        return formato;
    }

    public Artista getArtista() {
        return artista;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        
            return "Audio:"
                +"\nNombre: "+getNombre()
                +"\nPeso: "+ getPeso()
                +"\nLocalizacion: "+ getLocalizacion()
                +"\nAbierto: "+isEstaAbierto()
                +"\nDuracion: "+getDuracion()
                +"\nPause: "+isEstaEnPause()
                +"\nFormato: "+this.formato
                +"\nAlto: "+this.artista+"px"
                +"\nAncho: "+this.album+"px";
    }
    
    
    
    
    
    
}
