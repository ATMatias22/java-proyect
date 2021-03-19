/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Inmobiliaria inmo = new Inmobiliaria();
      
      Barrio b1 = new Barrio("Almagro");
      Barrio b2 = new Barrio("Avellaneda");
      Barrio b3 = new Barrio("Parque Patricios");
      
      Propiedad p1 = new Propiedad("Medrano", 91000, Tipo.DEPARTAMENTO);
      Propiedad p2 = new Propiedad("Medrano 600", 111000, Tipo.CASA);
      Propiedad p3 = new Propiedad("Cordoba 1000", 151000, Tipo.CASA);
      Propiedad p4 = new Propiedad("Corrientes 100", 81000, Tipo.PH);
      
      Propiedad p5 = new Propiedad("CualquieraNoSeMeOcurre", 201000, Tipo.CASA);
      Propiedad p6 = new Propiedad("Avenida SiempreViva 742", 111000, Tipo.PH);
     
      
      Propiedad p7 = new Propiedad("Evergreen 742", 201000, Tipo.CASA);
      Propiedad p8 = new Propiedad("Calle falsa 123 ", 201000, Tipo.DEPARTAMENTO);
      Propiedad p9 = new Propiedad("Shelbyville 456", 111000, Tipo.CASA);
      
      b1.agregarPropiedad(p1);
      b1.agregarPropiedad(p2);
      b1.agregarPropiedad(p3);
      b1.agregarPropiedad(p4);
      
      b2.agregarPropiedad(p5);
      b2.agregarPropiedad(p6);

      b3.agregarPropiedad(p7);
      b3.agregarPropiedad(p8);
      b3.agregarPropiedad(p9);

      inmo.agregarBarrio(b1);
      inmo.agregarBarrio(b2);
      inmo.agregarBarrio(b3);

      
      //MOSTRAMOS TODAS LAS PROPIEDADES SEGUN EL TIPO DE PROPIEDAD (PUNTO B)
      //inmo.mostrarPropiedades(Tipo.CASA);
      
      //MOSTRAMOS TODAS LAS PROPIEDADES SIN FILTRO (PUNTO C)
      //inmo.mostrarPropiedades();
      
      //MOSTRAMOS CUAL BARRIO TIENE MAS PROPIEDADES (PUNTO D)
      /*  for (Barrio b : inmo.obtenerBarrioMaxProp()) {
            System.out.println(b);
        }
      */
      
      //borramos una propiedad pasandole la direccion (PUNTO E)
      //inmo.borrarPropiedad("CualquieraNoSeMeOcurre");
      
      //CAMBIAMOS  LA PROPIEDAD A OTRO BARRIO (PUNTO F)
      //inmo.cambiarPropiedadDeBarrio("Shelbyville 456", b1);

      
     
        
    }
    
}


