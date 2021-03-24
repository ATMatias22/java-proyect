/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DVFlix d = new DVFlix();

        Pelicula p1 = new Pelicula("Pelicula 1", 120, TipoServicio.PREMIUM);
        Pelicula p2 = new Pelicula("Pelicula 2", 150, TipoServicio.STANDARD);
        Pelicula p3 = new Pelicula("Pelicula 3", 130, TipoServicio.PREMIUM);
        Pelicula p4 = new Pelicula("Pelicula 4", 122, TipoServicio.STANDARD);
        Pelicula p5 = new Pelicula("Pelicula 5", 128, TipoServicio.PREMIUM);
        Pelicula p6 = new Pelicula("Pelicula 6", 110, TipoServicio.STANDARD);
        Pelicula p7 = new Pelicula("Pelicula 7", 105, TipoServicio.STANDARD);
        Pelicula p8 = new Pelicula("Pelicula 8", 100, TipoServicio.STANDARD);
        Pelicula p9 = new Pelicula("Pelicula 9", 103, TipoServicio.PREMIUM);
        Pelicula p10 = new Pelicula("Pelicula 10", 90, TipoServicio.PREMIUM);
        
        d.agregarPelicula(p1);
        d.agregarPelicula(p2);
        d.agregarPelicula(p3);
        d.agregarPelicula(p4);
        d.agregarPelicula(p5);
        d.agregarPelicula(p6);
        d.agregarPelicula(p7);
        d.agregarPelicula(p8);
        d.agregarPelicula(p9);
        d.agregarPelicula(p10);

        Cliente c1 = new Cliente("1111111111", "Matias", TipoServicio.PREMIUM);
        Cliente c2 = new Cliente("2222222222", "Alejandro", TipoServicio.STANDARD);
        Cliente c3 = new Cliente("3333333333", "Florencia", TipoServicio.STANDARD);
        Cliente c4 = new Cliente("4444444444", "Omar", TipoServicio.PREMIUM);
        Cliente c5 = new Cliente("4444444444", "Lola", TipoServicio.STANDARD);
        
        d.agregarCliente(c1);
        d.agregarCliente(c2);
        d.agregarCliente(c3);
        d.agregarCliente(c4);
        d.agregarCliente(c5);
        
        System.out.println(d.verPelicula("2222222222", "Pelicula 9"));
        System.out.println(d.verPelicula("2222222222", "Pelicula 8"));
        System.out.println(d.verPelicula("2222222222", "Pelicula 7"));
        System.out.println(d.verPelicula("2222222222", "Pelicula 6"));
        System.out.println(d.verPelicula("2222222222", "Pelicula 5"));
        
        System.out.println("----------------------------");
        c2.recorrerPeliculasVistas();
        

        

    }

}
