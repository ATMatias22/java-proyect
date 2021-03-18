/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        
        c.agregarVehiculo(new Vehiculo("Dos", 860000.2, Tipo.AUTO, Marca.GIAT));
        c.agregarVehiculo(new Vehiculo("Carnet", 1860000.2, Tipo.CAMIONETA, Marca.QUEGEOT));
        c.agregarVehiculo(new Vehiculo("Roca", 2860000.2, Tipo.AUTO, Marca.DEBROLET));
        c.agregarVehiculo(new Vehiculo("Hacker", 2500000.2, Tipo.AUTO, Marca.DEBROLET));
        c.agregarVehiculo(new Vehiculo("utilitario", 1780000.2, Tipo.UTILITARIO, Marca.GIAT));
        
        
        System.out.println("La cantidad de vehiculos son: "+c.cantidadDeVehiculosSegunMarca(Marca.QUEGEOT));
   

        for (Vehiculo v : c.vehiculosMasEconomicos()) {
            System.out.println(v);
        }
    }
    
}
