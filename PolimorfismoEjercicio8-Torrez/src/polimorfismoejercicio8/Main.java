/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;


/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cabina c = new Cabina(1, new Sube(5));
        Cabina c1 = new Cabina(2, new Efectivo());
        Cabina c2 = new Cabina(3, new Pase(10));
        Cabina c3 = new Cabina(4, new Pase(4));
        Cabina c4 = new Cabina(5, new Efectivo());

        Vehiculo v = new Auto("abc 123");
        Vehiculo v1 = new Camion("xyz 123");
        Vehiculo v2 = new Moto("mln 123");
        
        EstacionDePeaje e = new EstacionDePeaje(0, "Primera estacion");
        
        e.agregarCabinas(c);
        e.agregarCabinas(c1);
        e.agregarCabinas(c2);
        e.agregarCabinas(c3);
        e.agregarCabinas(c4);
        
        System.out.println(c1.cobrar(v2));
        System.out.println(c1.cobrar(v1));
        
        for (Cabina cab : e.cabinasConEfectivo()) {
            System.out.println(cab);
        }
        
        
        
        
    }
    
}
