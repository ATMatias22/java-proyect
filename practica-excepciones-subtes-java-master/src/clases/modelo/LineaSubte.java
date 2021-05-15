package clases.modelo;

import errores.EstacionInvalidaException;
import java.util.ArrayList;

public enum LineaSubte {

    A, B, C, D, E, H;

    private String nombre;
    private ArrayList<String> estaciones;

    private LineaSubte() {
        this.nombre = this.name();
        this.estaciones = new ArrayList<String>();
    }

    public void addEstacion(String estacion) {
        this.estaciones.add(estacion);
    }

    public String getEstacion(int indice) {
        if (indice > getCantEstaciones() || indice < 0) {
            throw new EstacionInvalidaException("ESTACION " + (indice) + " INVALIDA");
        }
        indice--;

        return this.estaciones.get(indice);
    }

    public int getCantEstaciones() {
        return this.estaciones.size();
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "LineaSubte [nombre=" + nombre + ", estaciones=" + estaciones + "]";
    }
}
