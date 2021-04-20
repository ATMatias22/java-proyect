/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matias
 */
public class DiaDeTrabajo {
    
    private DayOfWeek nombre;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public DiaDeTrabajo(DayOfWeek nombre, String horaEntrada, String horaSalida) {
        this.nombre = nombre;
        this.horaEntrada = LocalTime.parse(horaEntrada, DateTimeFormatter.ofPattern("HH:mm"));
        this.horaSalida = LocalTime.parse(horaSalida, DateTimeFormatter.ofPattern("HH:mm"));;
    }

    public DayOfWeek getNombre() {
        return nombre;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }
    
    public boolean trabajoEsteDiaDeLaSemana(DayOfWeek d){
        return d.equals(this.nombre);
    }
    
    public void horarios(){
        System.out.println("Dia: " + this.nombre);
        while (!horaEntrada.equals(horaSalida)) {
            System.out.println(horaEntrada + " " + horaEntrada.plusHours(1));
            horaEntrada = horaEntrada.plusHours(1);
        }       
                System.out.println("------------------------------");

    }

    @Override
    public String toString() {
        return "DiaDeTrabajo{" + "nombre=" + nombre + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
    
    
    
    
}
