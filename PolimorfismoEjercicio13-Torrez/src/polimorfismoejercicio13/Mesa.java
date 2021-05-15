/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13;

import java.util.ArrayList;
import java.util.Scanner;
import polimorfismoejercicio13.empleados.Empleado;
import polimorfismoejercicio13.empleados.Mozo;
import polimorfismoejercicio13.enumerados.MetodoDePago;
import polimorfismoejercicio13.menu.ElementosDelRestaurante;
import polimorfismoejercicio13.menu.Pedido;
import polimorfismoejercicio13.menu.Producto;

/**
 *
 * @author Matias
 */
public class Mesa {
    
    Scanner sc = new Scanner(System.in);
    private int numero;
    private int cantPersonas;
    private Cliente cliente;
    private Mozo mozo;
    private Pedido productosPedidos;

    public Mesa(int numero, int cantPersonas) {
        this.numero = numero;
        this.cantPersonas = cantPersonas;
        this.cliente = null;
        this.mozo = null;
        this.productosPedidos = null;
    }

    public void colocarMesaPorDefault(){
        this.productosPedidos = null;
        this.mozo = null;
        this.cliente = null;
    }
    

    public int getNumero() {
        return numero;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public boolean estaLibre() {
        return this.cliente == null;
    }

    public Mozo getMozo() {
        return mozo;
    }
    
    public boolean soportaCapacidadDeAcompaniantes(int c){
        return c <= cantPersonas;
    }
    
    public boolean puedoReservarlaAlCliente( int c){
        return estaLibre() && soportaCapacidadDeAcompaniantes(c);
    }
    

    public boolean tienenMozo() {
        return this.mozo != null;
    }

    public void agregarCliente(Cliente c) {
            this.cliente = c;
    }

    public void agregarMozo(Mozo m) {
        this.mozo = m;
    }
   
    /*----------------BUSCAR MOZOS-----------------*/


    private Mozo buscarMozoPorLegajo(String legajo) {
        int i = 0;
        Mozo mEncontrada = null;
        ArrayList<Mozo> mozos = ElementosDelRestaurante.mozos();

        while (i < mozos.size() && mEncontrada == null) {
            Mozo aux = mozos.get(i);
            if (aux.getLegajo().equalsIgnoreCase(legajo)) {
                mEncontrada = aux;
            }
            i++;
        }

        return mEncontrada;
    }

    public Mozo buscarMozosParaElCliente() {
        Mozo mElegida = null;
        
        ElementosDelRestaurante.mostrarMozos();
        
            System.out.println("Coloque el legajo del mozo para llamarlo");
            String respuesta = sc.nextLine();
            mElegida = buscarMozoPorLegajo(respuesta);

            if (mElegida != null) {
                agregarMozo(mElegida);
                System.out.println("El mozo: "+ mElegida.getNombre() + " ya esta yendo a su mesa");
                mElegida.agregarMesa(this);
            } else {
                System.out.println("Coloco un mozo erroneo no disponible");
            }

        System.out.println("---------------------------------------");

        return mElegida;
    }
    
    public void recorrerProductosPedidos(){
        productosPedidos.recorrerProductosPedidos();
    }
    
    public Pedido pedirProductos(){
        
        productosPedidos = new Pedido(numero, mozo, cliente.getMetodoDePago());

        System.out.println("Elija lo que quiera\n");
        int i = 0;
        do {            
            ElementosDelRestaurante.mostrarMenu();
            System.out.println("Coloque el numero del producto que pedira porfavor");
            System.out.println("Si no pedira nada mas coloque 0");
            i = sc.nextInt();
            Producto pElegido = ElementosDelRestaurante.buscarProductoElegido(i);
            
            if(pElegido != null){
                productosPedidos.agregarProductos(pElegido);
            }
        } while (i != 0);
        
        recorrerProductosPedidos();
        
        System.out.println("-------------------------------");
        
        System.out.println("Llamando al mozo");
        System.out.println("Mozo comprobando el pedido");
        Pedido p = mozo.tomarNota(productosPedidos);

        System.out.println("Pedido tomado, ya esta realizandose su pedido");
        
        return p;
        
    }
    
    public void recibirProductosPedidos(){
        System.out.println("Muchas gracias Mozo: "+ mozo.getNombre());
    }
    
    public void pedirCuenta(){
        mozo.liberarMesa(this);
        System.out.println("Muchas gracias cliente");
    }
    
}
