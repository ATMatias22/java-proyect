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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Empresa e = new Empresa();
        
        e.agregarEmpleado(new EmpleadoAComision(25, 1000, "Juan", "Perez", "11333555", 2015));
        e.agregarEmpleado(new EmpleadoAComision(10, 1000, "Pablo", "Perez", "11222333", 2019));
        e.agregarEmpleado(new EmpleadoAComision(30, 1000, "Pedro", "Perez", "11222444", 2017));
        e.agregarEmpleado(new EmpleadoAComision(17, 1000, "Maria", "Perez", "11333444", 2015));
        e.agregarEmpleado(new EmpleadoAComision(18, 1000, "Laura", "Perez", "11555777", 2016));
        e.agregarEmpleado(new EmpleadoConSalarioFijo(30000, "Matias", "Perez", "22333444", 2019));
        e.agregarEmpleado(new EmpleadoConSalarioFijo(30000, "Gabriel", "Perez", "33444555", 2020));
        e.agregarEmpleado(new EmpleadoConSalarioFijo(30000, "Carlos", "Perez", "44555666", 2017));
        e.agregarEmpleado(new EmpleadoConSalarioFijo(30000, "Federico", "Perez", "55666777", 2015));
        
        
//        e.empleadoConMasClientes().mostrarSalario();

        e.mostrarEmpleados();
        
    }
    
}
