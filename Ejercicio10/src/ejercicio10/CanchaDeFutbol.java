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
public class CanchaDeFutbol {

    private String nombre;
    private Arbitro arbitro;
    private ArrayList<Bloque> bloques;

    public CanchaDeFutbol(String nombre, Arbitro arbitro) {
        this.nombre = nombre;
        this.arbitro = arbitro;
        this.bloques = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public int cantidadBloques() {

        return bloques.size();
    }

    public boolean existeCanchaConNombre(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }

    public ArrayList<Bloque> devolverBloquesLibres() {
        ArrayList<Bloque> bloquesLibres = new ArrayList<>();
        for (Bloque b : bloques) {
            if (!b.estaOcupado()) {
                bloquesLibres.add(b);
                System.out.println("Bloque libre");
            }
        }
        return bloquesLibres;
    }
    
    
    public Bloque buscarEnLosLibres(Bloque bloqueABuscar){
        
        ArrayList<Bloque> bloquesLibres = devolverBloquesLibres();
        int i = 0;
        Bloque bEncontrado = null;
        
        while(i < bloquesLibres.size() && bEncontrado == null){
            Bloque aux = bloquesLibres.get(i);
            if(aux.equals(bloqueABuscar)){
                bEncontrado = aux;
            }
            i++;
        }
        
        return bEncontrado;
        
        
    }

//    public boolean hayTurno(ArrayList<Bloque> turnosQuePidioUsuario) {
//
//        int i = 0;
//        int j = 0;
//        ArrayList<Bloque> bloquesLibres = devolverBloquesLibres();
//
//        
//        for (Bloque b : turnosQuePidioUsuario) {
//            if(b.)
//        }
//        
////        while (i < bloquesLibres.size() && j < turnosQuePidioUsuario.size()) {
////            Bloque aux = bloquesLibres.get(i);
////            Bloque aux2 = turnosQuePidioUsuario.get(j);
////            if (aux.esEsteHorario(aux2.getHoraInicial(), aux2.getHoraFinal())) {
////                if (!aux.estaOcupado()) {
////                    System.out.println("El horario " + aux.getHoraInicial() + "-" + aux.getHoraFinal() + " esta libre");
////                } else {
////                    System.out.println("El horario " + aux.getHoraInicial() + "-" + aux.getHoraFinal() + " esta ocupado");
////                }
////                j++;
////            }
////
////            i++;
////
////        }
//
//        return false;
//    }

}
