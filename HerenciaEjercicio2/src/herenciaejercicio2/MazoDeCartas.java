/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2;

import herenciaejercicio2.carta.Carta;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class MazoDeCartas {
    
    private ArrayList<Carta> cartas;

    public MazoDeCartas() {
        cartas = new ArrayList<>();
    }
    
    public void agregarCartas(Carta c){
        cartas.add(c);
    }
    
    
}
