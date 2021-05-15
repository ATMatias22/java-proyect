/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio13.empleados;

/**
 *
 * @author Matias
 */
public class Gerente extends Empleado{
    
    private int cantPersonasACargo;

    public Gerente(int cantPersonasACargo, String nombre, String legajo, String fechaIngreso) {
        super(nombre, legajo, fechaIngreso);
        this.cantPersonasACargo = cantPersonasACargo;
    }
    
    
}
