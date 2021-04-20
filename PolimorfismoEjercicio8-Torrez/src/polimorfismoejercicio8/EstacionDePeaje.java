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
public class EstacionDePeaje {
    
    private final static int HORA_ACTUAL = 11;
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
    
    public static int dameHoraActual(){
        return HORA_ACTUAL;
    }
    
    public ArrayList<Cabina> cabinasConEfectivo(){
        ArrayList cabEfectivo = new ArrayList();
        
        for (Cabina c : cabinas) {
            if(c.getMetodoDePago() instanceof Efectivo){
                cabEfectivo.add(c);
            } 
        }
        return cabEfectivo;
    }
    
    public double promedioDemora(){
        double total = 0;
        int totalDeCabinasConDemora = 0;
        for (Cabina c : cabinas) {
            MetodoDePago aux = c.getMetodoDePago();
            if(aux instanceof ConDemora){
               total += ((ConDemora)aux).getDiasDeDemoraEnElCobro();
               totalDeCabinasConDemora++;
            }
        }
        return totalDeCabinasConDemora != 0 ? total / totalDeCabinasConDemora : 0;
    }
    
    
}
