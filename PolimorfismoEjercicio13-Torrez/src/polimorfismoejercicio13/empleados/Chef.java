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
public class Chef extends Cocinero {

    
    private String titulo;

    public Chef(String titulo, int aniosExperiencia, String nombreAseguradora, String nombre, String legajo, String fechaIngreso) {
        super(aniosExperiencia, nombreAseguradora, nombre, legajo, fechaIngreso);
        this.titulo = titulo;
    }

 

    
    
}
