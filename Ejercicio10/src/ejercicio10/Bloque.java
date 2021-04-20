/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matias
 */
public class Bloque {
    private LocalDateTime horaInicial;
    private LocalDateTime horaFinal;
    private Usuario usuario;
    private Arbitro arbitro;

    public Bloque(LocalDateTime horaInicial, LocalDateTime horaFinal, Usuario usuario, Arbitro arbitro) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.usuario = usuario;
        this.arbitro = arbitro;
    }
    
    public Bloque(LocalDateTime horaInicial, LocalDateTime horaFinal) {
       this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public LocalDateTime getHoraInicial() {
        return horaInicial;
    }

    public LocalDateTime getHoraFinal() {
        return horaFinal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }
    
    public void agregarUsuario(Usuario u){
        if(!estaOcupado()){
            this.usuario = u;
            System.out.println("Bloque libre se agrego correctamente el usuario");
        }else{
            System.out.println("Bloque Ocupado ");
        }
        
    }
    
    public boolean esEsteHorario(LocalDateTime hInicial, LocalDateTime hFinal){
        return hInicial.equals(this.horaInicial) && hFinal.equals(this.horaFinal) ;
        
    }
    
    public boolean estaOcupado(){
        return usuario != null;
    }
    
   
    
}
