/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class TallerDeBicicletas {


    public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
        int contador = 0;
        for (Bicicleta b : bicicletas) {
            if(b.sePuedeAgarrar()){
                System.out.println(b.toString());
                contador++;
            }
        }
        return contador;
    }

}
