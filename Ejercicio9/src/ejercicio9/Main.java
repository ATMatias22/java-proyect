/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Matias", 2);
        Cliente c2 = new Cliente("Alejandro", 2);
        Cliente c3 = new Cliente("Torrez", 2);

        Hotel h = new Hotel("Hotel", "Calle falsa 123");
        Habitacion hab1 = new Habitacion(123, 1000);
        Habitacion hab2 = new Habitacion(456, 1000);
        Habitacion hab3 = new Habitacion(789, 1000);

        Adicional a1 = new Adicional(1200, LocalDate.parse("22/5/1998", DateTimeFormatter.ofPattern("dd/M/yyyy")), Tipo.TRASLADO);
        Adicional a2 = new Adicional(1200, LocalDate.parse("22/5/1998", DateTimeFormatter.ofPattern("dd/M/yyyy")), Tipo.DESAYUNO);
        Adicional a3 = new Adicional(1200, LocalDate.parse("22/5/1998", DateTimeFormatter.ofPattern("dd/M/yyyy")), Tipo.ROOM_SERVICE);

        hab1.agregarAdicional(a1);
        hab1.agregarAdicional(a2);
        hab2.agregarAdicional(a2);
        hab3.agregarAdicional(a1);
        hab3.agregarAdicional(a2);
        hab3.agregarAdicional(a3);

        h.agregarHabitacion(hab1);
        h.agregarHabitacion(hab2);
        h.agregarHabitacion(hab3);
        
        hab1.agregarCliente(c1);
        hab2.agregarCliente(c2);
        
        System.out.println(h.realizarCheckout(123));
        System.out.println(h.realizarCheckout(456));
        System.out.println(h.realizarCheckout(789));
        
//        for (Habitacion hab : h.obtenerHabitacionesDisponibles()) {
//            System.out.println(hab);
//        }
//        
//        

    }

}
