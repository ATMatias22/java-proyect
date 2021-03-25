/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Matias
 */
public class Asiento {
    
    private int fila;
    private Letra letra;
    private TipoEstado estado;

    public Asiento(int fila, Letra letra) {
        this.fila = fila;
        this.letra = letra;
        this.estado = TipoEstado.LIBRE;
    }

    public int getFila() {
        return fila;
    }

    public Letra getLetra() {
        return letra;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }
    
    public boolean filaEncontrada(int f){
        boolean encontrado = false;
        if(f == this.fila){
            encontrado = true;
        }
        return encontrado;
    }
    
    public boolean letraEncontrada(Letra l){
        boolean encontrado = false;
        if(l == this.letra){
            encontrado = true;
        }
        return encontrado;
    }
    
    public boolean estaLibre(){
        boolean estaLibre = false;
        if(TipoEstado.LIBRE == this.estado){
            estaLibre = true;
        }
        return estaLibre;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", letra=" + letra + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
    
    
}
