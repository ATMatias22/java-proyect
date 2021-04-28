/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10.productos.insumoInformatico;

import polimorfismoejercicio10.Facturable;
import polimorfismoejercicio10.Matematica;

/**
 *
 * @author Matias
 */
public class InsumoInformatico implements Facturable{
    
    private String nombre;
    private Tipo tipo;
    private double precioLista;

    public InsumoInformatico(String nombre, Tipo tipo, double precioLista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioLista = precioLista;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getPrecioLista() {
        return precioLista;
    }


    public double costoDelProducto() {
        return Matematica.sumarPorcentaje(this.precioLista, tipo.getPorcentajeGanancia());
    }

    @Override
    public double total() {
        System.out.println(Matematica.sumarPorcentaje(costoDelProducto(), IVA));
                System.out.println("---------------------");

        return Matematica.sumarPorcentaje(costoDelProducto(), IVA);
    }
    
    
    
}
