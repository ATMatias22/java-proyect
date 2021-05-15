/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio11;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Centro {
    
    private ArrayList<Dia> dias;

    public Centro() {
    this.dias = new ArrayList<>();
    }
    
    public void agregarDia(Dia d){
        this.dias.add(d);
    }
    
    /*PUNTO B*/
    public double revisar(){
        int personasAfuera = 0;
        int totalPersonasInscriptas = 0;
        for (Dia d : dias) {
                d.enviarMensaje();
                totalPersonasInscriptas += d.cantidadDeInscriptos();
                personasAfuera += d.cantidadDePersonasAfuera();
        }
        
        return totalPersonasInscriptas != 0 ? personasAfuera  * 100 / totalPersonasInscriptas  : 0;
    }
    
    
      /*PUNTO C*/
    public void mostrarDiasConMasPrioritarios(){
        int acumulador = 0;
        Dia diaConMasPrioritarios = null;
        
        for (Dia d : dias) {
            int cant = d.cantidadDePersonasConPrioridadIgualA();
            if(cant > acumulador){
                acumulador = cant;
                diaConMasPrioritarios = d;
            }
        }
        
        System.out.println(diaConMasPrioritarios);
        
    }
    
    
}
