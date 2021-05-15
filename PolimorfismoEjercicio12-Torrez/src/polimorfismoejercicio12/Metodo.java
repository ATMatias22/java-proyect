/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12;

import polimorfismoejercicio12.interfaces.Calificable;

/**
 *
 * @author Matias
 */
public class Metodo implements Calificable{
    private String nombre;
    private int cantParametros;
    private int cantInstrucciones;
    private int cantRamificaciones;

    public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificaciones) {
        this.nombre = nombre;
        this.cantParametros = cantParametros;
        this.cantInstrucciones = cantInstrucciones;
        this.cantRamificaciones = cantRamificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantParametros() {
        return cantParametros;
    }

    public int getCantInstrucciones() {
        return cantInstrucciones;
    }

    public int getCantRamificaciones() {
        return cantRamificaciones;
    }

    @Override
    public double indiceCalidad() {
        return 5/(this.cantParametros +1) +20/ this.cantInstrucciones +3 / (this.cantRamificaciones +1);
    }

    @Override
    public String toString() {
        return "Metodo{" + "nombre=" + nombre + ", cantParametros=" + cantParametros + ", cantInstrucciones=" + cantInstrucciones + ", cantRamificaciones=" + cantRamificaciones + '}';
    }

    
    
    
    
}
