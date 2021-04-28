/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio9.torrez;

import barcos.Barco;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Puerto {

    private ArrayList<Amarra> amarras;

    public Puerto() {
        amarras = new ArrayList<>();
    }

    public void agregarAmarra(Amarra a) {
        this.amarras.add(a);
    }

    public int barcosConAlquilerMayor(double alq) {
        int contador = 0;
        for (Amarra a : amarras) {
            if (!a.estaDisponible()) {
                if (a.elBarcoEsMayorAlPrecio(alq)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public Barco barcoConMayorConsumo() {
        Barco barcoMayorConsumo = null;
        double consumo = 0;
        for (Amarra a : amarras) {
            if (a.consumoDelBarco() > consumo) {
//                barcoMayorConsumo = a.getBarco();
                consumo = a.consumoDelBarco();
            }
        }

        return barcoMayorConsumo;
    }

}
