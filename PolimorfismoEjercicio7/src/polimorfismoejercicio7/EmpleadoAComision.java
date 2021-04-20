/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio7;

/**
 *
 * @author Matias
 */
public class EmpleadoAComision extends Empleado {

    private final static double SUELDO_MINIMO = 20000;
    private int numClientCapt;
    private int montoPorCliente;

    public EmpleadoAComision(int numClientCapt, int montoPorCliente, String nombre, String apellido, String dni, int anioDeIngreso) {
        super(nombre, apellido, dni, anioDeIngreso);
        this.numClientCapt = numClientCapt;
        this.montoPorCliente = montoPorCliente;
    }

    public int getNumClientCapt() {
        return numClientCapt;
    }

    public int getMontoPorCliente() {
        return montoPorCliente;
    }

    @Override
    public double obtenerSalario() {
        return numClientCapt*montoPorCliente > SUELDO_MINIMO ?  numClientCapt*montoPorCliente : SUELDO_MINIMO;       
    }

    @Override
    public void mostrarSalario() {
        System.out.println("Empleado a comision:");
                 super.mostrarSalario();
                                  System.out.println("-----------------------------------");

        
    }

}
