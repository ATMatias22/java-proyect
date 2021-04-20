/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;

import polimorfismoejercicio8.metodoDePago.*;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Cabina {
   
    private final static double INCREMENTO_HORA_PICO = 0.8;
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
    
    private double incrementarSiEsHoraPico(Vehiculo v){
        return EstacionDePeaje.esHoraPico() ? (v.getCat().getTarifa()*INCREMENTO_HORA_PICO):0;
    }
    
    public double precioAPagarSegunLaHora(Vehiculo v){
        return v.getCat().getTarifa() + incrementarSiEsHoraPico(v);
    }
      
    public double cobrar(Vehiculo v){
          if(EstacionDePeaje.esHoraPico()){
            System.out.println("ES HORA PICO");
        }else{
            System.out.println("NO ES HORA PICO");
        }
        return   precioAPagarSegunLaHora(v)- precioAPagarSegunLaHora(v)*this.metodoDePago.getDescuento();
    }
    
    public boolean soyEfectivo(){
        
        return this.metodoDePago instanceof Efectivo;
    }
    
     public boolean soyConDemora(){
        
        return this.metodoDePago instanceof ConDemora;
    }
  

    @Override
    public String toString() {
        return "Cabina{" + "id=" + id + ", metodoDePago=" + metodoDePago + '}';
    }
    
    
    

    
    
    
    
}
