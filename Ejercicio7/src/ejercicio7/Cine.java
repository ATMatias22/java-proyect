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
public class Cine {

    private ArrayList<Funcion> funciones;

    public Cine() {

        funciones = new ArrayList<>();

    }
    
    public int contarFunciones(){
        
        return funciones.size();
    }

    public void mostrarFuncionesDelDia(LocalDate dia) {
        for (Funcion f : funciones) {
            if (f.getDia() == dia) {
                f.mostrarHorarioYAsientosLibres();
            }
        }
    }

    public boolean hayLugar(LocalDate dia, LocalTime hora) {
      //TE MUESTRA TODAS LAS FUNCIONES QUE TIENEN ESPACIO SEGUN LA HORA Y EL DIA
      //EN REALIDAD LA CONSIGNA TE PEDIA QUE SOLO MUESTRE UNA FUNCION,
      //PERO ME PARECIO MAS COMPLETO MOSTRAR TODAS
        boolean hayLugar = false;
        for (Funcion f : funciones) {
            if (f.getDia() == dia && f.getHora() == hora) {
                if (f.obtenerAsientosLibres() != null) {
                    f.mostrarHorarioYAsientosLibres();
                    hayLugar = true;
                }
            }
        }
        return hayLugar;
    }

}
