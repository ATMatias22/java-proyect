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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TallerDeBicicletas t = new TallerDeBicicletas();

        ArrayList<Bicicleta> bicis = new ArrayList<>();

        bicis.add(new Bicicleta("marca1", "1980", 1800));
        bicis.add(new Bicicleta("marca2", "1980", 2000));
        bicis.add(new BicicletaElectrica("marca3", "1980", 2500, 200));
        bicis.add(new BicicletaElectrica("marca4", "1980", 2500, 248));
        
        
        System.out.println(t.cantServiciosPosibles(bicis));

    }

}
