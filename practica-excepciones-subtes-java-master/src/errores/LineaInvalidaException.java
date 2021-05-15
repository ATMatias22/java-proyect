package errores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matias
 */
public class LineaInvalidaException extends RuntimeException{
    
        public LineaInvalidaException(String s) {
        super(s);
    }
    
}
