/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author Matias
 */
public class AlumnoCandidato {
    private String nombre;
    private String mail;

    public AlumnoCandidato(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "AlumnoCandidato{" + "nombre=" + nombre + ", mail=" + mail + '}';
    }


    
    
    
}
