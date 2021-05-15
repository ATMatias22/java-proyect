/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class CoCode {

    private ArrayList<Programa> programas;

    public CoCode() {
        this.programas = new ArrayList<>();
    }

    public ArrayList<Programa> programasPorDebajoDe(double calidadMinima) {
        ArrayList<Programa> aux = new ArrayList<>();
        for (Programa p : programas) {
            if (p.indiceCalidad() < calidadMinima) {
                aux.add(p);
            }
        }

        return aux;
    }

}
