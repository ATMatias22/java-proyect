/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Hotel {

    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public int cantHabitaciones() {
        return habitaciones.size();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public ArrayList<Habitacion> obtenerHabitacionesDisponibles() {

        ArrayList<Habitacion> habitacionesLibres = new ArrayList<>();
        for (Habitacion hL : habitaciones) {
            if (!hL.isEstaOcupada()) {
                habitacionesLibres.add(hL);
            }
        }
        return habitacionesLibres;
    }

    public double realizarCheckout(int n) {
        /*   Habitacion hEncontrar = null;
        int i = 0;
        double totaAPagar= -1;
        
        while(i < cantHabitaciones() && hEncontrar == null){
            hEncontrar = habitaciones.get(i);
            if(hEncontrar.existeHabitacion(n)){
                if(hEncontrar.isEstaOcupada()){
                    totaAPagar = hEncontrar.calcularTotal();
                }
            }else{
                hEncontrar = null;
            }
            i++;
        }
        return totaAPagar;*/


 /*    Habitacion hEncontrar = null;
        Habitacion aux = null;
        int i = 0;
        double totaAPagar= -1;
        
        while(i < cantHabitaciones() && hEncontrar == null){
            aux = habitaciones.get(i);
            if(aux.existeHabitacion(n)){
                if(aux.isEstaOcupada()){
                    totaAPagar = aux.calcularTotal();
                }
                hEncontrar = aux;
            }
            i++;
        }
          return totaAPagar;*/
        Habitacion hEncontrar = null;
        int i = 0;
        double totaAPagar = -1;

        while (i < cantHabitaciones() && hEncontrar == null) {
            Habitacion aux = habitaciones.get(i);
            if (aux.existeHabitacion(n)) {
                if (aux.isEstaOcupada()) {
                    totaAPagar = aux.calcularTotal();
                }
                hEncontrar = aux;
            }
            i++;
        }
        return totaAPagar;

    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", habitaciones=" + habitaciones + '}';
    }

}
