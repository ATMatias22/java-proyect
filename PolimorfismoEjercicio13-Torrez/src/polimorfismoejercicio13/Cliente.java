/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13;

import polimorfismoejercicio13.enumerados.MetodoDePago;

/**
 *
 * @author Matias
 */
public class Cliente {
    
    private String nombre;
    private MetodoDePago metodoDePago;
    private int personasAcompaniantes;

    public Cliente(String nombre, MetodoDePago metodoDePago, int personasAcompaniantes) {
        this.nombre = nombre;
        this.metodoDePago = metodoDePago;
        this.personasAcompaniantes = personasAcompaniantes;
    }

    public String getNombre() {
        return nombre;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public int getPersonasAcompaniantes() {
        return personasAcompaniantes;
    }

   
    
    
    
    
    
}
