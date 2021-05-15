/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13.menu;

import java.util.ArrayList;
import polimorfismoejercicio13.Mesa;
import polimorfismoejercicio13.empleados.Chef;
import polimorfismoejercicio13.empleados.Cocinero;
import polimorfismoejercicio13.empleados.Empleado;
import polimorfismoejercicio13.empleados.Gerente;
import polimorfismoejercicio13.empleados.Mozo;
import polimorfismoejercicio13.enumerados.Categoria;
import static polimorfismoejercicio13.menu.ElementosDelRestaurante.menu;

/**
 *
 * @author Matias
 */
public class ElementosDelRestaurante {
    
    public final static ArrayList<Empleado> empleados(){
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        
        empleados.add(new Mozo("a", "123", "21/3/2021", Categoria.A));
        empleados.add(new Mozo("b", "456", "21/3/2021", Categoria.B));
        empleados.add(new Mozo("c", "789", "22/3/2021", Categoria.C));
        empleados.add(new Mozo("d", "111", "24/3/2021", Categoria.B));
        empleados.add(new Mozo("e", "222", "29/3/2021", Categoria.C));
        empleados.add(new Mozo("f", "333", "30/3/2021", Categoria.A));
        empleados.add(new Gerente(5, "Matias", "545", "21/03/2020"));
        empleados.add(new Cocinero(5, "Aseguradora 1", "Jose", "3728", "21/02/2020"));
        empleados.add(new Cocinero(1, "aseguradora 1","Mariano","3302","21/02/2020"));
        empleados.add(new Chef("chef 1",3, "aseguradora 2","Juan","5504","21/02/2020"));
        empleados.add(new Cocinero(2, "aseguradora 2","Merlin","7802","21/02/2020"));
        empleados.add(new Chef("chef 2",1, "aseguradora 1","Pablo","5202","21/02/2020"));
        empleados.add(new Cocinero(5, "aseguradora 3","Mariana","3244","21/02/2020"));

        return empleados;
    }
    
    public final static ArrayList<Mesa> mesas(){
        
        ArrayList<Mesa> mesas = new ArrayList<>();
        
        mesas.add(new Mesa(1, 5));
        mesas.add(new Mesa(2, 5));
        mesas.add(new Mesa(3, 4));
        mesas.add(new Mesa(4, 2));
        mesas.add(new Mesa(5, 8));
        mesas.add(new Mesa(6, 8));
        mesas.add(new Mesa(7, 3));
        mesas.add(new Mesa(8, 4));
        
        return mesas;
        
    }
    
    public final static Mesa buscarMesa(int nroMesa){
        
        ArrayList<Mesa> mesas = mesas();
        int i = 0;
        Mesa mEncontrada = null;
        while(i < mesas.size() && mEncontrada == null){
            Mesa aux = mesas.get(i);
            if(aux.getNumero() == nroMesa){
                mEncontrada = aux;
            }
            i++;
        }
        
        return mEncontrada;
        
    }

    public final static ArrayList<Producto> menu() {
        ArrayList<Producto> productosDelMenu = new ArrayList<>();

        productosDelMenu.add(new Bebida(120, true, "Coca", 120));
        productosDelMenu.add(new Bebida(120, true, "pepse", 200));
        productosDelMenu.add(new Bebida(120, true, "Jugo", 104));
        productosDelMenu.add(new Bebida(120, true, "agua", 50));
        productosDelMenu.add(new Plato("Color azul", true, true, "Pizza", 120));
        productosDelMenu.add(new Plato("Color verde", true, false, "Pizza  verde", 120));
        productosDelMenu.add(new Plato("Color amarillo", false, true, "Pizza amarilla", 120));

        return productosDelMenu;
    }

    public final static void mostrarMenu() {
        ArrayList<Producto> menu = menu();
        int i = 1;
        for (Producto m : menu) {
            System.out.println("Producto " + i + "\n" + m.toString());
            System.out.println("------------------------------");
            i++;
        }
    }

    public final static Producto buscarProductoElegido(int nro) {
        Producto pElegido = null;
        if (nro > 0) {
            int nroReal = (nro - 1);
            pElegido = menu().get(nroReal);
        }
        return pElegido;
    }

    public final static ArrayList<Mozo> mozos() {
        ArrayList<Mozo> mozos = new ArrayList<>();
        for (Empleado e : empleados()) {
            if(e instanceof Mozo){
                mozos.add((Mozo)e);
            }
        }
        return mozos;
    }

    public final static void mostrarMozos() {
        System.out.println("Aca estan todos los mozos:");
        for (Mozo m : mozos()) {
            System.out.println("Nombre del mozo: " + m.getNombre() + "\nLegajo: " + m.getLegajo());
        }
        System.out.println("---------------------------------------");
    }

    public final static ArrayList<Cocinero> cocineros() {
        ArrayList<Cocinero> cocinero = new ArrayList<>();
        for (Empleado c : empleados()) {
            if(c instanceof Cocinero){
                cocinero.add((Cocinero)c);
            }
        }
        return cocinero;
    }

    public final static Cocinero elegirCocineroConMenosPedidos() {
        Cocinero cocineroAsignado = null;
        int cantidadPedidos = Integer.MAX_VALUE;
        for (Cocinero c : cocineros()) {
            if (c.cantidadPedidosACargo() < cantidadPedidos) {
                cocineroAsignado = c;
                cantidadPedidos = c.cantidadPedidosACargo();
            }
        }
        return cocineroAsignado;
    }

}
