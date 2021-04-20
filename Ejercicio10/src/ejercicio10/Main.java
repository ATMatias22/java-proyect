/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

        Club c = new Club();
        
        c = null;
        
        
        DiaDeTrabajo dia1 = new DiaDeTrabajo(DayOfWeek.MONDAY, "20:00", "22:00");
        DiaDeTrabajo dia2 = new DiaDeTrabajo(DayOfWeek.WEDNESDAY, "18:00", "23:00");
        DiaDeTrabajo dia3 = new DiaDeTrabajo(DayOfWeek.FRIDAY, "17:00", "23:00");
        
        LocalDateTime ldt = LocalDateTime.parse("05/04/2021 20:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime ldt1 = LocalDateTime.parse("05/04/2021 23:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
         LocalDateTime ldt2 = LocalDateTime.parse("07/04/2021 20:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime ldt3 = LocalDateTime.parse("07/04/2021 22:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime ldt4 = LocalDateTime.parse("08/04/2021 18:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime ldt5 = LocalDateTime.parse("08/04/2021 21:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        
        Agenda agen1 = new Agenda(ldt, ldt1);
        Agenda agen3 = new Agenda(ldt2, ldt3);
        Agenda agen4 = new Agenda(ldt4, ldt5);
        
        Arbitro a1 = new Arbitro("Matias", "1133587926");
        
        a1.agregarDiasQueTrabajo(dia1);
        a1.agregarDiasQueTrabajo(dia2);
        a1.agregarDiasQueTrabajo(dia3);
        
        
        
//        System.out.println(ldt.getDayOfWeek());
//        System.out.println(a1.esteDiaDeLaSemanaTrabajo(ldt));
//        
                a1.agregarAgenda(agen1);
                a1.agregarAgenda(agen3);
                a1.agregarAgenda(agen4);

a1.recorrerDiasQueEstanOcupados();


        
//        a1.agregarDiaQueFuiReservado(new Agenda(ldt, ldt1));




        

    }
    
}
