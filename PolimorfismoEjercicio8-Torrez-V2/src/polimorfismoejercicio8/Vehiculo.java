/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8;

/**
 *
 * @author Matias
 */
public class Vehiculo {
     private String patente;
    private Categoria cat;

    public Vehiculo(String patente, Categoria cat) {
        this.patente = patente;
        this.cat = cat;
    }

    public String getPatente() {
        return patente;
    }

    public Categoria getCat() {
        return cat;
    }

    
}
