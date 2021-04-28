/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10.servicios;

import polimorfismoejercicio10.Facturable;
import polimorfismoejercicio10.Matematica;

/**
 *
 * @author Matias
 */
public abstract class Servicio implements Facturable {

    private int cantHoras;

    public Servicio(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public abstract double getPrecioHora();

    public double costoDelProducto() {
        return this.getCantHoras() * getPrecioHora();
    }

    @Override
    public double total() {
        System.out.println(costoDelProducto());
        
        System.out.println("---------------------");
        return Matematica.sumarPorcentaje(costoDelProducto(), IVA / 2);
    }

}
