/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Club {

    private ArrayList<CanchaDeFutbol> canchas;
    private ArrayList<Usuario> usuarios;

    public Club() {

        canchas = new ArrayList<>();
        usuarios = new ArrayList<>();

    }

    public int cantCanchas() {
        return this.canchas.size();
    }

//    private void buscarCanchaDeFutbolConHorario(LocalDateTime hInicial,LocalDateTime hFinal){
//        int i = 0;
//        CanchaDeFutbol cEncontrada = null;
//        while(i <= cantCanchas() && cEncontrada == null){
//            CanchaDeFutbol aux = canchas.get(i);
//            if(aux.)
//            
//        }
//    }
    public void agregarCanchaDeFutbol(CanchaDeFutbol c) {
        canchas.add(c);
    }

    public void agregarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, esta apunto de reservar una cancha de futbol");
        System.out.println("Por favor coloque la fecha y el horario inicial en este formato (dd/mm/yyyy hh:mm)");
        String hInicial = sc.next();
        System.out.println("Por favor coloque la fecha y el horario final en este formato (dd/mm/yyyy hh:mm)");
        String hFinal = sc.next();

        LocalDateTime LDTInicial = LocalDateTime.parse(hInicial, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime LDTFinal = LocalDateTime.parse(hFinal, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        ArrayList<Bloque> bloquesElegidos = new ArrayList<>();

        while (!LDTInicial.equals(LDTFinal)) {
            System.out.println(LDTInicial + " " + LDTInicial.plusHours(1));
            bloquesElegidos.add(new Bloque(LDTInicial, LDTInicial.plusHours(1)));
            LDTInicial = LDTInicial.plusHours(1);
        }

        int i = 0;
        int j = 0;
        boolean hayTurno = false;
        while (i < canchas.size() && j < bloquesElegidos.size() && hayTurno == false) {
            CanchaDeFutbol eCancha = canchas.get(i);
            for (Bloque b : bloquesElegidos) {
                if(eCancha.buscarEnLosLibres(b) != null){
                    j++;
                }
            }
            
            if(j == bloquesElegidos.size()){
                hayTurno = true;
            }else{
                j= 0;
            }

        }
        
        if(hayTurno){
            System.out.println("Por Lo visto los horarios que eligio estan desocupados");

        }

    }

    public void agregarUsuarioYDarleTurno() {

    }

    public boolean reservarCancha() {

        return false;
    }
}
