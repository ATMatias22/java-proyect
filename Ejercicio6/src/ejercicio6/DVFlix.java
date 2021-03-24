/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class DVFlix {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;
    private final String CLIENTE_INEXISTENTE = "El cliente no existe";
    private final String CONTENIDO_INEXISTENTE = "La película no existe";
    private final String CLIENTE_DEUDOR = "El cliente posee deuda";
    private final String CONTENIDO_NO_DISPONIBLE = "La película es Premium y el cliente no está abonado a dicho servicio";
    private final String ALQUILER_OK = "La película puede verse sin inconvenientes. La película debería quedar registrada en el historial de películas vistas del cliente";

    public DVFlix() {
        peliculas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    //------------------------------CLIENTE------------------------------
    private boolean clientePuedeVerPelicula(Pelicula peliculaAVer, Cliente cliente) {
        boolean puedeVer = false;
        if (peliculaAVer.esPremium()) {
            if (cliente.esPremium()) {
                puedeVer = true;
            }
        } else {
            puedeVer = true;
        }
        return puedeVer;
    }

    public int cantidadClientes() {
        return clientes.size();
    }

    public Cliente verificarSiExisteClientePorDNI(String dni) {
        int i = 0;
        Cliente clienteEncontrado = null;

        while (i < cantidadClientes() && clienteEncontrado == null) {
            if (clientes.get(i).clienteTieneEsteDni(dni)) {
                clienteEncontrado = clientes.get(i);
            }
            i++;
        }
        return clienteEncontrado;
    }

    public Cliente darDeBaja(String dni) {
        Cliente clienteEncontrado = verificarSiExisteClientePorDNI(dni);
        clientes.remove(clienteEncontrado);
        return clienteEncontrado;
    }

    public void recorrerClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    //-----------------------------------------------------------------
    //-----------------------PELICULAS--------------------------------

    public int cantidadPeliculas() {
        return peliculas.size();
    }

    public Pelicula verificarSiExistePeliculaPorNombre(String pelicula) {
        int i = 0;
        Pelicula peliculaEncontrada = null;

        while (i < cantidadPeliculas() && peliculaEncontrada == null) {
            if (peliculas.get(i).tieneEsteNombre(pelicula)) {
                peliculaEncontrada = peliculas.get(i);
            }
            i++;
        }
        return peliculaEncontrada;
    }

    public String verPelicula(String dni, String peliculaAVer) {
        String respuesta = null;
        Cliente cliente = verificarSiExisteClientePorDNI(dni);
        Pelicula pelicula = verificarSiExistePeliculaPorNombre(peliculaAVer);
        if (cliente != null) {
            if (pelicula != null) {
                if (cliente.esDeudor() == false) {
                    if (clientePuedeVerPelicula(pelicula, cliente)) {
                        respuesta = ALQUILER_OK;
                        cliente.agregarPeliculaVista(pelicula);
                    } else {
                        respuesta = CONTENIDO_NO_DISPONIBLE;
                    }
                } else {
                    respuesta = CLIENTE_DEUDOR;
                }
            } else {
                respuesta = CONTENIDO_INEXISTENTE;
            }
        } else {
            respuesta = CLIENTE_INEXISTENTE;
        }

        return respuesta;
    }

    public void recorrerPeliculas() {
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }

}
