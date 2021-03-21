/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Matias
 */
public class Bicicleta {
    
    private String codigo;
    private Estado estado;

    public Bicicleta(String codigo, Estado estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "codigo=" + codigo + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
}
