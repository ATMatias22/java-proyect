/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio11;
import polimorfismoejercicio11.enums.*;
import polimorfismoejercicio11.interfaces.Notificable;
import polimorfismoejercicio11.interfaces.Priorizable;

/**
 *
 * @author Matias
 */
public class Persona implements Priorizable, Notificable{
    
    public static final int EDAD_PRIORITARIA = 60;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Motivo motivoDelTest;
    private Credencial obraSocial;

    public Persona(String dni, String nombre, String apellido, int edad, Motivo motivoDelTest, Credencial obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.motivoDelTest = motivoDelTest;
        this.obraSocial = obraSocial;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Motivo getMotivoDelTest() {
        return motivoDelTest;
    }

    @Override
    public boolean tieneObraSocial() {
        return this.obraSocial != null;
    }

    @Override
    public boolean esMayorOIgual() {
        return this.edad >= EDAD_PRIORITARIA;
    }

    @Override
    public boolean tuvoContactoEstrecho() {
        return this.motivoDelTest == Motivo.CONTACTO_ESTRECHO;
    }

    @Override
    public int tienePrioridad() {
        
       return  (!tieneObraSocial() && esMayorOIgual() && tuvoContactoEstrecho())? 1:2;
        
    }
    
    public void mensaje(String m) {
        System.out.println(m);
    }
    
    public boolean soyEstaPrioridad(int p){
        return p == tienePrioridad();
    }
    
    public void recibirMensaje(String m){
        System.out.println(m);
    }

 
    
    
    
    
    
    

 
    
    
   
    
}
