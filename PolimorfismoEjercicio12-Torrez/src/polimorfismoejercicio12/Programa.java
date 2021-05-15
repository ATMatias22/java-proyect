/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio12;

import java.util.ArrayList;
import polimorfismoejercicio12.fuentes.*;
import polimorfismoejercicio12.interfaces.Calificable;

/**
 *
 * @author Matias
 */
public class Programa implements Calificable {

    private int id;
    private String nombre;
    private String nombreDelResp;
    private boolean pasoPruebas;
    private ArrayList<Fuente> fuentes;

    public Programa(int id, String nombre, String nombreDelResp, boolean pasoPruebas) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDelResp = nombreDelResp;
        this.pasoPruebas = pasoPruebas;
        this.fuentes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreDelResp() {
        return nombreDelResp;
    }

    public boolean isPasoPruebas() {
        return pasoPruebas;
    }

    public ArrayList<Fuente> getFuentes() {
        return fuentes;
    }

    public int cantidadFuentes() {
        return this.fuentes.size();
    }

    public void mostrarDetalleDeMetodo(String nombre) {
        Metodo mEncontrado = null;
        int i = 0;

        while (i < cantidadFuentes() && mEncontrado == null) {
            if (this.fuentes.get(i) instanceof FuenteDeProgramacion) {
                FuenteDeProgramacion aux = (FuenteDeProgramacion) this.fuentes.get(i);
                Metodo auxMetodo = aux.buscarMetodoConEsteNombre(nombre);
                if (auxMetodo != null) {
                    mEncontrado = auxMetodo;
                }
            }
            i++;
        }

        if (mEncontrado != null) {
            System.out.println(mEncontrado);
        } else {
            System.out.println("No se encontro ningun metodo con este nombre");
        }
    }
    
    
    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio(){
        double promedio = Promediador.promedioIndiceCalidad(fuentes);
        ArrayList<Fuente> fuentesMayoresAlPromedio = new ArrayList<>();
        for (Fuente f : fuentes) {
            if(f.indiceCalidad() > promedio){
                fuentesMayoresAlPromedio.add(f);
            }
        }
        return fuentesMayoresAlPromedio;
    }

    @Override
    public double indiceCalidad() {
        return this.pasoPruebas ? Promediador.promedioIndiceCalidad(fuentes) : 0;
    }

}
