/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10;

import polimorfismoejercicio10.productos.insumoInformatico.InsumoInformatico;
import polimorfismoejercicio10.servicios.ServicioDeArmado;
import polimorfismoejercicio10.servicios.ServicioDeReparacion;
import polimorfismoejercicio10.productos.insumoInformatico.Tipo;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Comercio c = new Comercio();
        c.agregarFactura(new ServicioDeReparacion(5, 1));
        c.agregarFactura(new InsumoInformatico("A", Tipo.LIMPIEZA,250));
        c.agregarFactura(new ServicioDeReparacion(3, 4));
        c.agregarFactura(new ServicioDeArmado(10));
        
        
        System.out.println(c.montoTotalFacturado());
//        System.out.println(c.cantServiciosSimples());
        
     
    }
    
}
