/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10;

import polimorfismoejercicio10.servicios.ServicioDeReparacion;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Comercio {

    private ArrayList<Facturable> facturas;
    private final static int SERVICIO_DIFICULTAD_MENOR_A = 2;

    public Comercio() {

        facturas = new ArrayList<>();
    }
    
    public void agregarFactura(Facturable f){
        this.facturas.add(f);
    }

    public int cantServiciosSimples() {

        int contador = 0;
        for (Facturable f : facturas) {
            if (f instanceof ServicioDeReparacion) {
                ServicioDeReparacion s = ((ServicioDeReparacion) f);
                if (s.esDificultadMenorA(SERVICIO_DIFICULTAD_MENOR_A)) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public double montoTotalFacturado() {
        double total = 0;
        for (Facturable f : facturas) {
            total += f.total();
        }
        
        return total;

    }
}
