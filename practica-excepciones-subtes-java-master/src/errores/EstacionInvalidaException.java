/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

/**
 *
 * @author Matias
 */
public class EstacionInvalidaException extends RuntimeException{

    public EstacionInvalidaException(String s) {
        super(s);
    }
    
    
}
