/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13.menu;

import java.util.ArrayList;
import polimorfismoejercicio13.empleados.Cocinero;
import polimorfismoejercicio13.empleados.Mozo;
import polimorfismoejercicio13.enumerados.MetodoDePago;

/**
 *
 * @author Matias
 */
public class Pedido {
    
    private int nroMesa;
    private Mozo mozoDeLaMesa;
    private Cocinero cocinero;
    private MetodoDePago metodoDePagoUsado;
    private ArrayList<Producto> productosPedidos;
    private boolean estaRealizado ;

    public Pedido(int nroMesa, Mozo mozoDeLaMesa, MetodoDePago metodoDePagoUsado) {
        this.nroMesa = nroMesa;
        this.mozoDeLaMesa = mozoDeLaMesa;
        this.metodoDePagoUsado = metodoDePagoUsado;
        this.productosPedidos = new ArrayList<>();
        this.cocinero = null;
        this.estaRealizado = false;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public Mozo getMozoDeLaMesa() {
        return mozoDeLaMesa;
    }
    
    public Cocinero getCocinero() {
        return cocinero;
    }

    public MetodoDePago getMetodoDePagoUsado() {
        return metodoDePagoUsado;
    }

    public ArrayList<Producto> getProductosPedidos() {
        return productosPedidos;
    }

    public boolean isEstaRealizado() {
        return estaRealizado;
    }

    public void setEstaRealizado(boolean estaRealizado) {
        this.estaRealizado = estaRealizado;
    }

    public void setCocinero(Cocinero cocinero) {
        this.cocinero = cocinero;
    }
    
    
    
    public void agregarProductos(Producto p){
        this.productosPedidos.add(p);
    }
    
    
    public void recorrerProductosPedidos(){
        for (Producto p : productosPedidos) {
            System.out.println(p.getNombre());
        }
    }
    
    
    public double total(){
        double total = 0;
        for (Producto p : productosPedidos) {
            total += p.getPrecio();
        }
        return total;
    }
    
    
    
    
}
