/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Comuna {
    
    private int numero;
    private ArrayList<Estacion> estaciones;

    public Comuna(int numero) {
        this.numero = numero;
        this.estaciones = new ArrayList<>();
    }
    
    public void agregarEstacion(Estacion e){
        
        this.estaciones.add(e);
    }
    
    public int cantEstaciones(){
        
        return estaciones.size();
    }
    
    public Estacion verificarEstacion(int num){
     
        int i = 0;
        Estacion aux = null;
        
        while(i < cantEstaciones() && aux == null){
            if(estaciones.get(i).getId() == num)
            {
                aux = estaciones.get(i);
            }
            i++;
        }
        return aux;
    }
    
    public void mostrarEstadoDeEstacion(int numero,Estado e){
        Estacion aux = verificarEstacion(numero);
        if(aux != null){
            aux.mostrarCantidadDeBicicletasSegunSuEstadoEnPorcentaje(e);
        }else{
            System.out.println("No existe la estacion");
        }
    }
    
    public int cantMaximaDeBicicletasDisponiblesEnLaEstacion(){
        int max = 0;
        for (Estacion est : estaciones) {
            if(est.mostrarCantidadDeBicicletasSegunSuEstado(Estado.DISPONIBLE) > max){
                max =est.mostrarCantidadDeBicicletasSegunSuEstado(Estado.DISPONIBLE);
            }
        }
        return max;
    }
    
    public ArrayList<Estacion> estacionConMayorDisponibilidad(){
        ArrayList <Estacion> aux = new ArrayList<>();
        int max = cantMaximaDeBicicletasDisponiblesEnLaEstacion();
        for (Estacion est : estaciones) {
            if(max == est.mostrarCantidadDeBicicletasSegunSuEstado(Estado.DISPONIBLE) ){
                aux.add(est);
            }
        }
        System.out.println("LA estacion con "+max+" bicis disponibles es: ");
        return aux;
    }

    @Override
    public String toString() {
        return "Comuna{" + "numero=" + numero + ", estaciones=" + estaciones + '}';
    }
    
    
    
    
}
