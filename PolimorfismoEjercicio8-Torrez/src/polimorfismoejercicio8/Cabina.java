/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Cabina {
    private final static int INCREMENTO_HORA_PICO = 8;
    private final static int HORA_PICO_INICIO_TEMP = 6;
    private final static int HORA_PICO_FIN_TEMP = 10;
    private final static int HORA_PICO_INICIO_TAR = 17;
    private final static int HORA_PICO_FIN_TAR = 20;
    
    private int id;
    private MetodoDePago metodoDePago;

    public Cabina(int id, MetodoDePago metodoDePago) {
        this.id = id;
        this.metodoDePago = metodoDePago;
    }
    
    public int getId() {
        return id;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }
    
    private boolean esHoraPico(){
       return (EstacionDePeaje.dameHoraActual() >= HORA_PICO_INICIO_TEMP && EstacionDePeaje.dameHoraActual() <= HORA_PICO_FIN_TEMP) || (EstacionDePeaje.dameHoraActual() >= HORA_PICO_INICIO_TAR && EstacionDePeaje.dameHoraActual() <= HORA_PICO_FIN_TAR);
    }
    
    public double incrementarSiEsHoraPico(Vehiculo v){
      
        return esHoraPico() ? (v.getTarifa()*INCREMENTO_HORA_PICO/100):0;
        
    }
    
    public double precioAPagarSegunLaHora(Vehiculo v){
        
        return v.getTarifa() + incrementarSiEsHoraPico(v);
        
    }
    
    public double obtenerDescuentoPorMetodoDePago(Vehiculo v){
        
        return (precioAPagarSegunLaHora(v)*this.metodoDePago.getDescuento())/100;
    }
    
      
    public double cobrar(Vehiculo v){
          if(esHoraPico()){
            System.out.println("ES HORA PICO");
        }else{
            System.out.println("NO ES HORA PICO");

        }
        return precioAPagarSegunLaHora(v) - obtenerDescuentoPorMetodoDePago(v);

    }
  

    @Override
    public String toString() {
        return "Cabina{" + "id=" + id + ", metodoDePago=" + metodoDePago + '}';
    }
    
    
    

    
    
    
    
}
