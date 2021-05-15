/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12.fuentes;

import java.util.ArrayList;
import polimorfismoejercicio12.Metodo;
import polimorfismoejercicio12.Promediador;

/**
 *
 * @author Matias
 */
public class FuenteDeProgramacion extends Fuente {

    private ArrayList<Metodo> metodos;

    public FuenteDeProgramacion(ArrayList<Metodo> metodos, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.metodos = new ArrayList<>();
    }

    public int cantidadMetodos() {
        return this.metodos.size();
    }
    
    public Metodo buscarMetodoConEsteNombre(String n){
        Metodo mEncontrado = null;
        int i = 0;
        while(i < this.cantidadMetodos() && mEncontrado == null){
            Metodo aux = metodos.get(i);
            if(aux.getNombre().equals(n)){
                mEncontrado = aux;
            }
            i++;
        }
        return mEncontrado;
    }

    @Override
    public double indiceCalidad() {
        return Promediador.promedioIndiceCalidad(metodos);
    }

}
