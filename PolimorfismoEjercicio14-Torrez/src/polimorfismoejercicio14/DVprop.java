/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio14;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class DVprop {

    private ArrayList<Notificable> interesados;

    public DVprop() {
        interesados = new ArrayList<>();
    }
    
    public void agregarInteresado(Notificable n){
        this.interesados.add(n);
    }

}
