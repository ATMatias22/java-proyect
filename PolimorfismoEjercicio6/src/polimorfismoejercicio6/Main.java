/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio6;

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
        
        ArrayList<GrupoDeFiguras> figuras = new ArrayList<>();
        
        figuras.add(new Circunferencia(5, "red"));
        figuras.add(new Rectangulo(2, 4, "verde"));
        figuras.add(new TrianguloEquilatero(13, "azul"));  
        
        
        for (GrupoDeFiguras f : figuras) {
            f.mostrarInfoDeFiguras();
        }
        
    }
    
}
