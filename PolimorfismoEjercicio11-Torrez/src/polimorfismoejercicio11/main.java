/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio11;

import polimorfismoejercicio11.enums.Motivo;

/**
 *
 * @author Matias
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Centro c = new Centro();
        
        Dia d1 = new Dia("21/5/2021", true);
         Dia d2 = new Dia("22/5/2021", true);
        
        Persona p1 = new Persona("123123123", "Matias", "torrez", 60, Motivo.CONTACTO_ESTRECHO, new Credencial("sasda", 120));
        Persona p2 = new Persona("666665343", "Jose", "Fulano", 60, Motivo.CONTACTO_ESTRECHO, null);
        Persona p3 = new Persona("5555777745", "Juan", "Gulano", 20, Motivo.CONTACTO_ESTRECHO, null);
        
        d1.agregarPersona(p1);
        d1.agregarPersona(p2);
        
        d2.agregarPersona(p2);
      
        
        c.agregarDia(d1);
        c.agregarDia(d2);
        
        System.out.println(d1.promedioEdadPersonasSinOS());

        System.out.println(d1.cantidadDePersonasConPrioridadIgualA());
        System.out.println(c.revisar()+"%");
    }
    
}
