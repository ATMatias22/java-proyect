/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13;

import java.util.ArrayList;
import java.util.Scanner;
import polimorfismoejercicio13.empleados.*;
import polimorfismoejercicio13.menu.*;
import polimorfismoejercicio13.enumerados.*;

/**
 *
 * @author Matias
 */
public class Restaurante {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Empleado> empleados;
    private ArrayList<Mesa> mesas;
    private ArrayList<Pedido> pedidosFinalizados;

    public Restaurante() {
        this.empleados = ElementosDelRestaurante.empleados();
        this.mesas = ElementosDelRestaurante.mesas();
        this.pedidosFinalizados = new ArrayList<>();
    }

    public Pedido pedidoConMasBebidas(MetodoDePago m) {
        return null;
    }

    public int cantidadMesas() {
        return this.mesas.size();
    }

    private ArrayList<Mesa> mostrarMesasParaElCliente(Cliente c) {
        ArrayList<Mesa> mesasDisponiblesConCiertaCantidad = new ArrayList<>();
        for (Mesa m : mesas) {
            if (m.puedoReservarlaAlCliente(c.getPersonasAcompaniantes())) {
                mesasDisponiblesConCiertaCantidad.add(m);
                System.out.println("Mesa: n°" + m.getNumero() + "\nCon " + m.getCantPersonas() + " asientos");
                System.out.println("-------------------------------------");
            }
        }
        return mesasDisponiblesConCiertaCantidad.size() == 0 ? null : mesasDisponiblesConCiertaCantidad;
    }

    private Mesa buscarMesaPorNumero(int n) {
        int i = 0;
        Mesa mEncontrada = null;
        while (i < cantidadMesas() && mEncontrada == null) {
            Mesa aux = this.mesas.get(i);
            if (aux.getNumero() == n) {
                mEncontrada = aux;
            }
            i++;
        }
        return mEncontrada;
    }

    public Mesa buscarMesaParaCliente(Cliente c) {
        Mesa mElegida = null;
        if (mostrarMesasParaElCliente(c) != null) {
            System.out.println("Coloque el numero de la mesa que desea elegir");
            int respuesta = sc.nextInt();
            mElegida = buscarMesaPorNumero(respuesta);

            if (mElegida != null) {
                mElegida.agregarCliente(c);
                System.out.println("Coloquese en la mesa n°" + respuesta + " por favor");
            } else {
                System.out.println("Coloco una mesa no disponible");
            }
        } else {
            System.out.println("No hay mesas disponibles para usted");
        }

        System.out.println("---------------------------------------");

        return mElegida;
    }
    
    public void recolectarTodosLosPedidosQueRealizoCadaMozo(){
       

    }
    
    public void mostrarTodasLasVentasDelDia(){
        for (Pedido p : pedidosFinalizados) {
            System.out.println(p);
        }
    }
    
 
    public void iniciar(Cliente c){
        
        Mesa mesa = buscarMesaParaCliente(c);
        Mozo mozo = mesa.buscarMozosParaElCliente();
        Pedido p = mesa.pedirProductos();
        Cocinero cocinero = p.getCocinero();
        Pedido pedidoRealizado = cocinero.pedidoRealizado(mesa.getNumero());
        cocinero.llamarMozo(pedidoRealizado);
        mesa.pedirCuenta();
        
        
        
    }

}
