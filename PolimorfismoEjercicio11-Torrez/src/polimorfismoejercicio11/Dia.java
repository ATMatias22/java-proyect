/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio11;

import java.util.ArrayList;
import polimorfismoejercicio11.interfaces.Notificable;

/**
 *
 * @author Matias
 */
public class Dia {

    public static final int PRIORIDAD_A_BUSCAR = 1;
    private static final String MENSAJE = "No hay cupos para hoy";
    public static final int TEST_MAXIMOS = 50;
    private String fecha;
    private boolean esDiaHabil;
    private ArrayList<Persona> personas;

    public Dia(String fecha, boolean esDiaHabil) {
        this.fecha = fecha;
        this.esDiaHabil = esDiaHabil;
        this.personas = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public boolean esDiaHabil() {
        return esDiaHabil;
    }

    public void agregarPersona(Persona p) {
        if (esDiaHabil) {
            this.personas.add(p);
        } else {
            System.out.println("No se puede anotar en este dia");
        }
    }

    public int cantidadDeInscriptos() {
        return this.personas.size();
    }

    public boolean alcanzanLosTest() {
        return cantidadDeInscriptos() <= TEST_MAXIMOS;
    }

    public int cantidadDePersonasConPrioridadIgualA() {
        int contador = 0;
        for (Persona p : personas) {
            if (p.soyEstaPrioridad(PRIORIDAD_A_BUSCAR)) {
                contador++;
            }
        }
        return contador;
    }

    /*PUNTO D*/
    public int promedioEdadPersonasSinOS() {
        int contador = 0;
        int acumuladorEdad = 0;
        for (Persona p : personas) {
            if (!p.tieneObraSocial()) {
                contador++;
                acumuladorEdad += p.getEdad();
            }
        }
        return contador != 0 ? acumuladorEdad / contador : 0;
    }

    public double cantidadDePersonasAfuera() {
        int personasAfuera = 0;
        if (!alcanzanLosTest()) {
            for (int i = (TEST_MAXIMOS ); i < cantidadDeInscriptos(); i++) {
                personasAfuera++;
            }
        }
        return personasAfuera;
    }

    public void enviarMensaje() {
        if (!alcanzanLosTest()) {
            for (int i = (TEST_MAXIMOS ); i < cantidadDeInscriptos(); i++) {
                this.personas.get(i).mensaje(MENSAJE);
            }
            System.out.println("No alcanzan los test para el dia: " + this.fecha);
            System.out.println("---------------------");
        }
    }

    @Override
    public String toString() {
        return "Dia{" + "fecha=" + fecha + ", esDiaHabil=" + esDiaHabil + ", personas=" + personas + '}';
    }

}
