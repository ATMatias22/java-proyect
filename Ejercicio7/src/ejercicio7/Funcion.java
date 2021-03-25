/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Funcion {

    private LocalDate dia;
    private LocalTime hora;
    private ArrayList<Asiento> asientos;

    public Funcion(LocalDate dia, LocalTime hora) {
        this.dia = dia;
        this.hora = hora;
        asientos = new ArrayList<>();
        for (Letra l : Letra.values()) {
            for (int i = 0; i < 5; i++) {
                asientos.add(new Asiento(i, l));
            }
        }
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora;
    }
    
    public int contarAsientos(){
        return asientos.size();
    }
    
    public Asiento buscarAsiento(int fila, Letra l){
        int i = 0;
        Asiento asientoEncontrado = null;
        while(i < contarAsientos() && asientoEncontrado == null){
            if(asientos.get(i).filaEncontrada(fila) && asientos.get(i).letraEncontrada(l)){
                asientoEncontrado = asientos.get(i);
            }
        }
        return asientoEncontrado;
    }
    
    public Asiento modificarEstadoAsiento(int fila, Letra l, TipoEstado t){
        Asiento asientoModif = buscarAsiento(fila, l);
        if(asientoModif != null){
            asientoModif.setEstado(t);
        }
        return asientoModif;
    }


    public ArrayList<Asiento> obtenerAsientosLibres() {
        ArrayList<Asiento> asientosLibres = new ArrayList<>();
        for (Asiento a : asientos) {
            if (a.estaLibre()) {
                asientosLibres.add(a);
            }
        }
        return asientosLibres;
    }
    
   
    public int cantidadAsientosLibres(){
        return obtenerAsientosLibres().size();
    }
    
    public void mostrarHorarioYAsientosLibres(){
        System.out.println("EL horario de esta funcion es a las: "+ hora + "hs"
                + " y quedan "+ cantidadAsientosLibres() + " asientos libres");
        
    }

}
