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
public class Barrio {

    private String nombre;
    private ArrayList<Propiedad> propiedades;

    public Barrio(String nombre) {
        this.nombre = nombre;
        this.propiedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarPropiedad(Propiedad p){
        
        this.propiedades.add(p);
    }

    //PUNTO B
    public void mostrarPropiedades(Tipo t) {
        for (Propiedad p : this.propiedades) {
            if (p.getTipo().equals(t)) {
                System.out.println(p);
            }
        }
    }
    
    //FUNCION QUE AYUDA AL PUNTO C QUE ESTA EN INMOBILIARIA
    //RECORRE TODAS LAS PROPIEDADES DE UN BARRIO SIN NINGUN TIPO DE FILTRO
    public void mostrarPropiedades() {
        for (Propiedad p : this.propiedades) {
            System.out.println(p);
        }
    }

    //FUNCION QUE AYUDA AL PUNTO D
    //OBTIENE LA CANTIDAD DE PROPIEDADES DE UN BARRIO
    public int cantidadPropiedades() {
        return this.propiedades.size();
    }

    //funcion que ayuda al PUNTO E QUE ESTA EN INMOBILIARIA
    //BUSCA LA PROPIEDAD A ELIMINAR Y SI NO LA ENCUENTRA DEVUELVE NULL
    public Propiedad eliminarPropiedad(String domicilio) {
        
        Propiedad encontrado = buscarDomicilioDePropiedad(domicilio);
     
        if (encontrado != null) {
        //borramos directamente en donde encuentre el objeto identico 
            Propiedad aux = encontrado;
            this.propiedades.remove(encontrado);
            return aux;

        } else {
            return encontrado;
        }

    }
    
//eN ESTE MOMENTO SOLO AYUDA A ELIMINARPROPIEDAD(STRING)
//BUSCA UNA PROPIEDAD CON EL DOMICILIO PASADO POR PARAMETRO Y SI NO ENCUENTRA DEVUELVE NULL
    public Propiedad buscarDomicilioDePropiedad(String domicilio) {

        int i = 0;
        Propiedad domPropiedad = null;
        while (i < this.propiedades.size() && domPropiedad == null) {
            if (this.propiedades.get(i).getDomicilio().equalsIgnoreCase(domicilio)) {
                domPropiedad = this.propiedades.get(i);
            }
            i++;
        }

        return domPropiedad;

    }

    @Override
    public String toString() {
        return "Barrio{" + "nombre=" + nombre + ", propiedades=" + propiedades + '}';
    }
    
    


}
