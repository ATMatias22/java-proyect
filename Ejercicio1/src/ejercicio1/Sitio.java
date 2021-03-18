/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Sitio {

    public ArrayList<Producto> productos;

    public Sitio() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {

        this.productos.add(p);

    }

    public void listarProductos() {
        System.out.println("Descripcion\tPrecio\tCategoria");
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            p.mostrar();
        }
    }

    public void listarProductos(Categoria cat) {

        for (Producto p : this.productos) {
            if (p.getCategoria() == cat) {
                p.mostrar();

            }
        }

    }

    public double precioPromedio() {
        return totalProductos()/ this.productos.size();
    }

    
    private double totalProductos(){
        double total = 0;
        for (Producto p : this.productos) {
            total += p.getPrecio();
        }

        return total;
        
    }
    
    public int cuantosProductos() {
        return this.productos.size();
    }

}
