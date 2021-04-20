/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class BarajaInglesa {
    private ArrayList<MazoDeCartas> mazo;

    public BarajaInglesa() {
        mazo = new ArrayList<>();
    }
    
    public void agregarUnMazoDeCartas(MazoDeCartas m){
        this.mazo.add(m);
    }
    
    
    
}
