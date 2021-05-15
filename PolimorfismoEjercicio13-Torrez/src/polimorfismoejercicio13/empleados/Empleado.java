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
public abstract class Empleado {
    
    private String nombre;
    private String legajo;
    private String fechaIngreso;

    public Empleado(String nombre, String legajo, String fechaIngreso) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }
    
   
    
    
    
}
