/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Agenda {
    
    private LocalDateTime hInicio;
    private LocalDateTime hFinal;
    private boolean estaOcupado;
//    CanchaDeFutbol canchasADirigir;
    
    public Agenda(LocalDateTime hInicio, LocalDateTime hFinal) {
        this.hInicio = hInicio;
        this.hFinal = hFinal;
        estaOcupado = false;
//        canchasADirigir = c;
    }
    
    public LocalDateTime gethInicio() {
        return hInicio;
    }

    public LocalDateTime gethFinal() {
        return hFinal;
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }
    
    
    
    
    
    
    
    
    
    
}
