/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio14;

/**
 *
 * @author Matias
 */
public class Cliente implements Notificable{

    private String nombre;
    private String apellido;
    private String mail;
    private int telefono;

    public Cliente(String nombre, String apellido, String mail, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
    @Override
    public void recibirMensaje(String m) {
        System.out.println("He Recibido un SMS en mi telefono "+ this.telefono+ " con el mensaje: \n"+m);
    }
    
}
