/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;

import java.time.LocalTime;
import polimorfismoejercicio8.metodoDePago.Efectivo;
import polimorfismoejercicio8.metodoDePago.MetodoDePago;
import polimorfismoejercicio8.metodoDePago.ConDemora;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class EstacionDePeaje {
    
    private final static int HORA_PICO_INICIO_TEMP = 6;
    private final static int HORA_PICO_FIN_TEMP = 10;
    private final static int HORA_PICO_INICIO_TAR = 17;
    private final static int HORA_PICO_FIN_TAR = 20;
    private int id;
    private String descripcion;
    private ArrayList<Cabina> cabinas;

    public EstacionDePeaje(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.cabinas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void agregarCabinas(Cabina c){
        this.cabinas.add(c);
    }
    
    
    public static boolean esHoraPico(){
       return (EstacionDePeaje.dameHoraActual() >= HORA_PICO_INICIO_TEMP && EstacionDePeaje.dameHoraActual() <= HORA_PICO_FIN_TEMP)
               || (EstacionDePeaje.dameHoraActual() >= HORA_PICO_INICIO_TAR && EstacionDePeaje.dameHoraActual() <= HORA_PICO_FIN_TAR);
    }
    
    public static int dameHoraActual(){
        return LocalTime.now().getHour();
    }
    
    public ArrayList<Cabina> cabinasConEfectivo(){
        ArrayList cabEfectivo = new ArrayList();
        
        for (Cabina c : cabinas) {
            if(c.soyEfectivo()){
                cabEfectivo.add(c);
            } 
        }
        return cabEfectivo;
    }
    
    public double promedioDemora(){
        int total = 0;
        int totalDeCabinasConDemora = 0;
        for (Cabina c : cabinas) {
            if(c.soyConDemora()){
                ConDemora aux = ((ConDemora)c.getMetodoDePago());
               total += aux.getDiasDeDemoraEnElCobro();
               totalDeCabinasConDemora++;
            }
        }
        return totalDeCabinasConDemora != 0 ? (double) total / totalDeCabinasConDemora : 0;
    }
    
    
}
