/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13;
import polimorfismoejercicio13.enumerados.*;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurante r = new Restaurante();
        
        r.iniciar(new Cliente("Matias", MetodoDePago.EFECTIVO,5 ));
        
        r.recolectarTodosLosPedidosQueRealizoCadaMozo();
        
        
    }
    
}
