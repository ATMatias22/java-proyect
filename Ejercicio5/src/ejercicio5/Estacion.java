/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Estacion {
    
    private int id;
    private String nombre;
    private ArrayList<Bicicleta> bicicletas;

    public Estacion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        bicicletas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
    
    public void agregarBicicleta(Bicicleta b){
        bicicletas.add(b);
    }
    
    public int cantidadDeBicicletas(){
        return bicicletas.size();
    }
    
  
    public int mostrarCantidadDeBicicletasSegunSuEstado(Estado e){
        int contador = 0;
        for (Bicicleta b : bicicletas) {
            if(b.getEstado() == e){
                contador++;
            }
        }
        return contador;
    }
    
    public void mostrarCantidadDeBicicletasSegunSuEstadoEnPorcentaje(Estado e){
        double porcentaje = 0;
        porcentaje = (mostrarCantidadDeBicicletasSegunSuEstado(e)*100)/cantidadDeBicicletas();
        System.out.println(porcentaje+"% de las bicis estan en estado "+e);
    }

    @Override
    public String toString() {
        return "Estacion{" + "id=" + id + ", nombre=" + nombre + ", bicicletas=" + bicicletas + '}';
    }
    
    
    
    
}
