/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.musica;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Artista {
    private String nombre;
    private int edad;
    private String fechaNac;
    private ArrayList<Album> albums;

    public Artista(String nombre, int edad, String fechaNac, ArrayList<Album> albums) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.albums = albums;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
    
    public void agregarAlbum(Album a){
        albums.add(a);
    }
    
    public Album encontrarAlbum(Album a){
        int i = 0;
        Album eAlbum = null;
        
        while(i<albums.size() && eAlbum == null){
            Album aux = albums.get(i);
            if(aux.equals(a)){
                eAlbum = aux;
            }
            i++;
        }
        
        return eAlbum;
        
    }
    
    
    
}
