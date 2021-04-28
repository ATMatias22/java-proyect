/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio14;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DVprop dv = new DVprop();
        
        Cliente c = new Cliente("Matias", "torrez", "a", 12312312);
        
        dv.agregarInteresado(c);

        Inmobiliaria in = new Inmobiliaria("ASDQWE", "abc@a.com");

        dv.agregarInteresado(in);

        Inmueble i1 = new Inmueble("Aca", 100, 5, 100000);
        Inmueble i2 = new Inmueble("BCA", 100, 5, 130000);
        Inmueble i3 = new Inmueble("SDD", 100, 5, 110000);
        Inmueble i4 = new Inmueble("FFF", 10, 50, 115000);
        Inmueble i5 = new Inmueble("WWWW", 100, 5, 120000);
        in.agregarInmueble(i1);
        in.agregarInmueble(i2);
        in.agregarInmueble(i3);
        in.agregarInmueble(i4);
        in.agregarInmueble(i5);

        
        i1.agregarInteresado(in);
        i1.agregarInteresado(c);
        i1.setPrecio(30000);

    }

}
