/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10.productos.insumoInformatico;

/**
 *
 * @author Matias
 */
public enum Tipo {
    
    PERIFERICO(15),HARDWARE(10),LIMPIEZA(5);
    
    
    private double porcentajeGanancia;

    private Tipo(double precioLista) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    
    
    
    
}
