/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio7;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }
    
    public Empleado empleadoConMasClientes(){
        Empleado empConMasClientes = null;
        int max = 0;
        for (Empleado e : empleados) {
            if(e instanceof EmpleadoAComision){
                EmpleadoAComision aux = (EmpleadoAComision) e;
                if(aux.getNumClientCapt() > max){
                   max = aux.getNumClientCapt();
                   empConMasClientes = e;
                }
            }
        }
        
        return empConMasClientes;
        
    }
    
    public void mostrarEmpleados(){
        
        for (Empleado e : empleados) {
            
            e.mostrarSalario();
            
        }
        
    }


    
    
    
}
