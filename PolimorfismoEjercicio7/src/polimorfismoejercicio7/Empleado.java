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
public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private int anioDeIngreso;

    public Empleado(String nombre, String apellido, String dni, int anioDeIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anioDeIngreso = anioDeIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public abstract double obtenerSalario();

    public void mostrarSalario() {

        System.out.println("Nombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nSalario: " + obtenerSalario());
    }

}
