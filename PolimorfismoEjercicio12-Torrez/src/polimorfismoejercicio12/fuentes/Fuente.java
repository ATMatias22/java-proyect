/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12.fuentes;
import polimorfismoejercicio12.interfaces.*;

public abstract class Fuente implements Calificable {
    
    private String nombre;
    private String ubicacion;

    public Fuente(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
   
    
 
    
    
}
