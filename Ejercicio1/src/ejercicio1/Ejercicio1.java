/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Matias
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Sitio s = new Sitio();
        s.agregarProducto(new Producto("1", 233, "Buenaaaaaaao", Categoria.ZAPATO));
        s.agregarProducto(new Producto("2", 444, "Malaaaaao", Categoria.ZAPATILLA));
        s.agregarProducto(new Producto("3", 4444, "maaaaaas", Categoria.OJOTA));
        
        
        System.out.println(s.precioPromedio());
       

    }
    
}
