/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12;

import java.util.ArrayList;
import polimorfismoejercicio12.interfaces.Calificable;

/**
 *
 * @author Matias
 */
public class Promediador {
    
    public static double promedioIndiceCalidad(ArrayList<? extends Calificable> lista){
        double total = 0;
        
        for (Calificable c : lista) {
            total += c.indiceCalidad();
        }
        return lista.size() > 0 ? total/lista.size() : 0;
        
    }
    
    
    
}
