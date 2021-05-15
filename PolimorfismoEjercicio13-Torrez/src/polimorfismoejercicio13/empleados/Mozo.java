/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13.empleados;

import java.util.ArrayList;
import polimorfismoejercicio13.Cliente;
import polimorfismoejercicio13.Mesa;
import polimorfismoejercicio13.enumerados.Categoria;
import polimorfismoejercicio13.enumerados.MetodoDePago;
import polimorfismoejercicio13.menu.ElementosDelRestaurante;
import polimorfismoejercicio13.menu.Pedido;
import polimorfismoejercicio13.menu.Producto;

/**
 *
 * @author Matias
 */
public class Mozo extends Empleado{
    
    private Categoria categoria;
    private ArrayList<Pedido> pedidosActuales;
    private ArrayList<Pedido> pedidosAGuardar;
    private ArrayList<Mesa> mesasAtendidas;

    public Mozo(String nombre, String legajo, String fechaIngreso,Categoria categoria ) {
        super(nombre, legajo, fechaIngreso);
        this.categoria = categoria;
        this.pedidosActuales = new ArrayList<>();
        this.pedidosAGuardar = new ArrayList<>();
        this.mesasAtendidas = new ArrayList<>();
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    public void agregarPedido(Pedido p){
        this.pedidosAGuardar.add(p);
        this.pedidosActuales.add(p);
    }
    
    public void agregarMesa(Mesa m){
        this.mesasAtendidas.add(m);
    }
    
    public int cantidadPedidosActuales(){
        
        return this.pedidosActuales.size();
    }
    
    public ArrayList<Pedido> enviarPedidosRealizadosDelDia(){
        return pedidosAGuardar;
    }
    
    public void mostrarPedidosActualesNoRealizados(){
        for (Pedido p : pedidosActuales) {
            if(p.isEstaRealizado() == false){
                System.out.println(p.toString());
            }
        }
    }
    
    public void mostrarPedidosActualesRealizados(){
        for (Pedido p : pedidosActuales) {
            if(p.isEstaRealizado() == true){
                System.out.println(p.toString());
            }
        }
    }
    
    public Pedido buscarPedido(int nroMesa){
        int  i = 0;
        Pedido pEncontrado = null;
        
        while(i < cantidadPedidosActuales() && pEncontrado == null){
            Pedido aux = this.pedidosActuales.get(i);
            if(aux.getNroMesa() == nroMesa){
                pEncontrado = aux;
            }
            i++;
        }
        
        return pEncontrado;
    }
    
    public Mesa buscarMesa(int nro){
           int  i = 0;
        Mesa mEncontrado = null;
        
        while(i < cantidadPedidosActuales() && mEncontrado == null){
            Mesa aux = this.mesasAtendidas.get(i);
            if(aux.getNumero() == nro){
                mEncontrado = aux;
            }
            i++;
        }
        
        return mEncontrado;
    }
    

    public Pedido tomarNota(Pedido pedidoCliente){
        ArrayList<Cocinero> cocineros = ElementosDelRestaurante.cocineros();
        Cocinero cocineroAElegir = ElementosDelRestaurante.elegirCocineroConMenosPedidos();
        Pedido p = pedidoCliente;
        p.setCocinero(cocineroAElegir);
        agregarPedido(p);
        cocineroAElegir.agregarPedido(p);
        return p;
    }
    
  
    
    public void entregarComida(Pedido p){
        System.out.println("Entregando la comida a la mesa: "+p.getNroMesa()+
                "\nCon el pedido de: \n");
        for (Producto ped :  p.getProductosPedidos()) {
            System.out.println(ped.toString());
        }
        System.out.println("------------------------");
        Pedido pedidoBuscado = buscarPedido(p.getNroMesa());
        Mesa mEntregar = buscarMesa(pedidoBuscado.getNroMesa());
        mEntregar.recibirProductosPedidos();


    }
    
    public void liberarMesa(Mesa m){
        
        Pedido p = buscarPedido(m.getNumero());
        
        System.out.println("Mesa: n°"+p.getNroMesa()+
                " El total a pagar es: "+ p.total());
        
        this.pedidosActuales.remove(p);
        
        m.colocarMesaPorDefault();
        
        
    }

    

    
}
