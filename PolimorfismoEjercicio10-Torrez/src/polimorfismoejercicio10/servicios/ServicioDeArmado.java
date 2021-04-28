/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio10.servicios;

/**
 *
 * @author Matias
 */
public class ServicioDeArmado extends Servicio{

    public final static double PRECIO_HORA = 250;
    
    public ServicioDeArmado(int cantHoras) {
        super(cantHoras);
    }

    @Override
    public double getPrecioHora() {
        return PRECIO_HORA;
    }

 
   
    
    


    
    
    
}
