/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio9.torrez;

import barcos.*;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puerto p = new Puerto();
        
        Amarra a = new Amarra(0,"aca");
        Amarra a1 = new Amarra(1,"aba");
        Amarra a2 = new Amarra(2,"asa");
        Amarra a3 = new Amarra(3,"ada");
        Amarra a4 = new Amarra(4,"aea");
        Amarra a5 = new Amarra(5,"awa");
        Amarra a6 = new Amarra(6,"aqa");
        Amarra a7 = new Amarra(7,"aja");
        
        p.agregarAmarra(a);
        p.agregarAmarra(a1);
        p.agregarAmarra(a2);
        p.agregarAmarra(a3);
        p.agregarAmarra(a4);
        p.agregarAmarra(a5);
        p.agregarAmarra(a6);
        p.agregarAmarra(a7);


        Barco b = new EmbarcacionDeportivaAMotor("abc", 2, 3123, "Matias", 120, 10);
        Barco bar = new EmbarcacionDeportivaAMotor("123", 10, 2000, "Torrez", 10, 200);
        Barco bar1 = new EmbarcacionDeportivaAMotorDeLujo("345", 20, 100, "Alejandro", 15, 300);
        Barco bar2 = new Velero("acd", 10, 2010, "Jose", 10);
        Barco bar3 = new EmbarcacionDeportivaAMotorDeLujo("c45", 15, 100, "Ariel", 11, 250);
        Barco bar4 = new EmbarcacionDeportivaAMotor("1b3", 30, 2000, "Laura", 20, 300);
        Barco bar5 = new Yate("qwp", 30, 2010, "Maria", 10);

        
        a.alquilar(b);
        a1.alquilar(bar);
        a2.alquilar(bar1);
        a3.alquilar(bar2);
        a4.alquilar(bar3);
        a5.alquilar(bar4);
        a6.alquilar(bar5);
        
        System.out.println(p.barcosConAlquilerMayor(10000));
        
        System.out.println(p.barcoConMayorConsumo());
        

       
        

     
    }
    
}
