/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13.empleados;

import java.util.ArrayList;
import polimorfismoejercicio13.Mesa;
import polimorfismoejercicio13.menu.Pedido;

/**
 *
 * @author Matias
 */
public class Cocinero extends Empleado{
    
    private int aniosExperiencia;
    private String nombreAseguradora;
    private ArrayList<Pedido> pedidosACargo;

    public Cocinero(int aniosExperiencia, String nombreAseguradora, String nombre, String legajo, String fechaIngreso) {
        super(nombre, legajo, fechaIngreso);
        this.aniosExperiencia = aniosExperiencia;
        this.nombreAseguradora = nombreAseguradora;
        this.pedidosACargo = new ArrayList<>();
    }



    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getNombreAseguradora() {
        return nombreAseguradora;
    }
    
    public void agregarPedido(Pedido p){
        this.pedidosACargo.add(p);
    }
    
    
    public int cantidadPedidosACargo(){
        return this.pedidosACargo.size();
    }
    
    public Pedido pedidoRealizado(int nro){
        int i = 0;
        Pedido pEncontrado = null;
        
        while(i < cantidadPedidosACargo() && pEncontrado == null){
            Pedido aux = this.pedidosACargo.get(i);
            if(aux.getNroMesa() == nro){
                this.pedidosACargo.get(i).setEstaRealizado(true);
                pEncontrado = aux;
            }
        }
        return pEncontrado;
    }
    
    public void llamarMozo(Pedido p){
        p.getMozoDeLaMesa().entregarComida(p);
    }
    
    
    
    
}
