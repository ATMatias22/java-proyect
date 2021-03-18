/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Concesionaria {
    
    ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        
        vehiculos = new ArrayList<>();
        
    }
    
    public void agregarVehiculo(Vehiculo v){
        
        this.vehiculos.add(v);
        
    }
    
    public ArrayList<Vehiculo> vehiculosMasEconomicos(){
        ArrayList<Vehiculo> aux = new ArrayList<>();
        System.out.println("El promedio es:"+ promedioPrecioVehiculos());
        for (Vehiculo v : vehiculos) {
            if(v.getPrecio() <= promedioPrecioVehiculos()){
                aux.add(v);
            }
        }
      return aux;
    }
    
    private double promedioPrecioVehiculos(){
        double total= 0;
        for (Vehiculo v : vehiculos) {
            total += v.getPrecio();
        }
        return total / this.vehiculos.size();
        
    }
    
    public int cantidadDeVehiculosSegunMarca(Marca m){
        int total= 0;
        for (Vehiculo v : vehiculos) {
            if(v.getMarca().equals(m)){
                total++;
            }
        }
        
        return total;
        
    }
    
    
}
