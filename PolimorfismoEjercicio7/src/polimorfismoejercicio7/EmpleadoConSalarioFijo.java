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
public class EmpleadoConSalarioFijo extends Empleado {
    private final static int ANIO_ACTUAL = 2021;
    private final static int MENOS_DE_2 = 0;
    private final static int DE_2_A_5 = 5;
    private final static int DE_6_A_10 = 10;
    private final static int MAS_DE_10 = 15;
    private double salarioBasico;

    public EmpleadoConSalarioFijo(double salarioBasico, String nombre, String apellido, String dni, int anioDeIngreso) {
        super(nombre, apellido, dni, anioDeIngreso);
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public int incrementoPorCantidadDeAnios() {
        int aniosEnLaEmpresa = ANIO_ACTUAL - getAnioDeIngreso();
        int incrementoEn = 0;

        if (aniosEnLaEmpresa >= 0 && aniosEnLaEmpresa < 2) {
            incrementoEn = MENOS_DE_2;
        } else if (aniosEnLaEmpresa >= 2 && aniosEnLaEmpresa <= 5) {
            incrementoEn = DE_2_A_5;
        } else if (aniosEnLaEmpresa >= 6 && aniosEnLaEmpresa <= 10) {
            incrementoEn = DE_6_A_10;
        }else if(aniosEnLaEmpresa > 10) {
            incrementoEn = MAS_DE_10;
        }
        return incrementoEn;

    }

    @Override
    public double obtenerSalario() {
        return this.salarioBasico + (this.salarioBasico * incrementoPorCantidadDeAnios() / 100);
    }

    @Override
    public void mostrarSalario() {
        System.out.println("Empleado con salario fijo:");
                 super.mostrarSalario();
                 System.out.println("-----------------------------------");
        
    }

}
