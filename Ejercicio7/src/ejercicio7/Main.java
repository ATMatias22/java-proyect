/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/** 
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Cine c = new Cine();
        Funcion f = new Funcion(LocalDate.now(), LocalTime.now());

        
        /*for (Asiento a :  f.obtenerAsientosLibres()){
            System.out.println(a);
        }*/
       
        
        
        
    }
    
}
