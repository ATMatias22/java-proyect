/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio11;

/**
 *
 * @author Matias
 */
public class Credencial {
    
    private String nombre;
    private int nroAfiliado;

    public Credencial(String nombre, int nroAfiliado) {
        this.nombre = nombre;
        this.nroAfiliado = nroAfiliado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroAfiliado() {
        return nroAfiliado;
    }
    
    
    
}
