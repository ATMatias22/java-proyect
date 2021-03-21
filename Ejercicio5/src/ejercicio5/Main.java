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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //CREAMOS LAS COMUNAS
        Comuna c1 = new Comuna(1);
        Comuna c3 = new Comuna(3);
        Comuna c5 = new Comuna(5);
        //------------------------
        
        //CREAMOS LAS ESTACIONES
        Estacion e1c1 = new Estacion(125, "Estacion Bici 1 Comuna 1");
        Estacion e2c1 = new Estacion(126, "Estacion Bici 2 Comuna 1");
        Estacion e3c1 = new Estacion(127, "Estacion Bici 3 Comuna 1");
        
        Estacion e1c3 = new Estacion(325, "Estacion Bici 1 Comuna 3");
        Estacion e2c3 = new Estacion(326, "Estacion Bici 2 Comuna 3");
        
        Estacion e1c5 = new Estacion(525, "Estacion Bici 1 Comuna 5");
        Estacion e2c5 = new Estacion(526, "Estacion Bici 2 Comuna 5");
        //----------------------------------
        
        //CREAMOS LAS BICIS Y LAS COLOCAMOS EN LA COMUNA LA CUAL TIENE 3 ESTACIONES DE BICIS
        Bicicleta b1 = new Bicicleta("BiciE1C1-1", Estado.EN_USO);
        Bicicleta b2 = new Bicicleta("BiciE1C1-2", Estado.DISPONIBLE);
        Bicicleta b3 = new Bicicleta("BiciE1C1-3", Estado.EN_USO);
        Bicicleta b4 = new Bicicleta("BiciE1C1-4", Estado.EN_USO);
        Bicicleta b5 = new Bicicleta("BiciE1C1-5", Estado.EN_REPARACION);
        
        Bicicleta b6 = new Bicicleta("BiciE2C1-1", Estado.EN_REPARACION);
        Bicicleta b7 = new Bicicleta("BiciE2C1-2", Estado.EN_USO);
        Bicicleta b8 = new Bicicleta("BiciE2C1-3", Estado.DISPONIBLE);
        Bicicleta b9 = new Bicicleta("BiciE2C1-4", Estado.EN_REPARACION);
        
        Bicicleta b10 = new Bicicleta("BiciE3C1-1", Estado.EN_REPARACION);
        Bicicleta b11 = new Bicicleta("BiciE3C1-2", Estado.EN_USO);
        Bicicleta b12 = new Bicicleta("BiciE3C1-3", Estado.DISPONIBLE);
        Bicicleta b13 = new Bicicleta("BiciE3C1-4", Estado.EN_REPARACION);
        
        e1c1.agregarBicicleta(b1);
        e1c1.agregarBicicleta(b2);
        e1c1.agregarBicicleta(b3);
        e1c1.agregarBicicleta(b4);
        e1c1.agregarBicicleta(b5);
        
        e2c1.agregarBicicleta(b6);
        e2c1.agregarBicicleta(b7);
        e2c1.agregarBicicleta(b8);
        e2c1.agregarBicicleta(b9);
        
        e3c1.agregarBicicleta(b10);
        e3c1.agregarBicicleta(b11);
        e3c1.agregarBicicleta(b12);
        e3c1.agregarBicicleta(b13);
        //---------------------------------------------


        //CREAMOS LAS BICIS Y LAS COLOCAMOS EN LA COMUNA 3 LA CUAL TIENE 2 ESTACIONES DE BICIS
        Bicicleta b14 = new Bicicleta("BiciE1C3-1", Estado.DISPONIBLE);
        Bicicleta b15 = new Bicicleta("BiciE1C3-2", Estado.DISPONIBLE);
        Bicicleta b16 = new Bicicleta("BiciE1C3-3", Estado.DISPONIBLE);
        Bicicleta b17 = new Bicicleta("BiciE1C3-4", Estado.DISPONIBLE);
        
        Bicicleta b18 = new Bicicleta("BiciE2C3-1", Estado.EN_USO);
        Bicicleta b19 = new Bicicleta("BiciE2C3-2", Estado.EN_USO);
        Bicicleta b20 = new Bicicleta("BiciE2C3-3", Estado.EN_USO);
        Bicicleta b21 = new Bicicleta("BiciE2C3-4", Estado.EN_REPARACION);
        
        e1c3.agregarBicicleta(b14);
        e1c3.agregarBicicleta(b15);
        e1c3.agregarBicicleta(b16);
        e1c3.agregarBicicleta(b17);
        
        e2c3.agregarBicicleta(b18);
        e2c3.agregarBicicleta(b19);
        e2c3.agregarBicicleta(b20);
        e2c3.agregarBicicleta(b21);
        //--------------------------------------------------------------------
        
        //CREAMOS LAS BICIS Y LAS COLOCAMOS EN LA COMUNA 5 LA CUAL TIENE 2 ESTACIONES DE BICIS
        Bicicleta b22 = new Bicicleta("BiciE1C5-1", Estado.EN_REPARACION);
        Bicicleta b23 = new Bicicleta("BiciE1C5-2", Estado.EN_USO);
        Bicicleta b24 = new Bicicleta("BiciE1C5-3", Estado.EN_REPARACION);
        Bicicleta b25 = new Bicicleta("BiciE1C5-4", Estado.DISPONIBLE);
        
        Bicicleta b26 = new Bicicleta("BiciE2C5-1", Estado.DISPONIBLE);
        Bicicleta b27 = new Bicicleta("BiciE2C5-2", Estado.DISPONIBLE);
        Bicicleta b28 = new Bicicleta("BiciE2C5-3", Estado.EN_USO);
        Bicicleta b29 = new Bicicleta("BiciE2C5-4", Estado.EN_REPARACION);
        
        e1c5.agregarBicicleta(b22);
        e1c5.agregarBicicleta(b23);
        e1c5.agregarBicicleta(b24);
        e1c5.agregarBicicleta(b25);
        
        e2c5.agregarBicicleta(b26);
        e2c5.agregarBicicleta(b27);
        e2c5.agregarBicicleta(b28);
        e2c5.agregarBicicleta(b29);
        //--------------------------------------------------------------------
        
        //AGREGAMOS A CADA COMUNA LAS ESTACIONES DE BICIS
        c1.agregarEstacion(e1c1);
        c1.agregarEstacion(e2c1);
        c1.agregarEstacion(e3c1);
        
        c3.agregarEstacion(e1c3);
        c3.agregarEstacion(e2c3);
        
        c5.agregarEstacion(e1c5);
        c5.agregarEstacion(e2c5);
        //--------------------------------------------------
        
        
        //PUNTO B
        c1.mostrarEstadoDeEstacion(125, Estado.EN_USO);
        
        
        //PUNTO C
        ArrayList <Estacion> estaciones =c1.estacionConMayorDisponibilidad();
        for (Estacion est :  estaciones) {
            
            System.out.println(est);
        }
    
     
       
        

    }
    
}
