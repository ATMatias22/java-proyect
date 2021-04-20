/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Arbitro {

    private String nombre;
    private String telefono;
    private ArrayList<DiaDeTrabajo> diasQueTrabajo;
    private ArrayList<Agenda> diasQueFuiReservado;

    public Arbitro(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.diasQueFuiReservado = new ArrayList<>();
        diasQueTrabajo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean soyEsteArbitro(String nombre, String telefono) {

        return this.nombre == nombre && this.telefono == telefono;
    }

    public void agregarDiasQueTrabajo(DiaDeTrabajo d) {

        this.diasQueTrabajo.add(d);

    }

    public void agregarAgenda(Agenda a) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime hInicial = a.gethInicio();
        LocalDateTime hFinal = a.gethFinal();
        ArrayList<Agenda> auxAgenda = new ArrayList<>();

        if (trabajoEsteDia(a.gethInicio(), a.gethFinal())) {
            while (!hInicial.equals(hFinal)) {
                System.out.println(hInicial + " " + hInicial.plusHours(1));
                Agenda aux = new Agenda(hInicial, hInicial.plusHours(1));
                if (verificarSiEstaOcupado(aux) == null) {
                    auxAgenda.add(aux);
                }
                hInicial = hInicial.plusHours(1);
            }
        }
        
        for (Agenda auxAgen : auxAgenda) {
            System.out.println("Desea agregar este horario: "+auxAgen.gethInicio()+"----"+auxAgen.gethFinal()  );
            String respuesta = sc.next();
            if(respuesta.equalsIgnoreCase("si")){
                auxAgen.setEstaOcupado(true);
                diasQueFuiReservado.add(auxAgen);
                
            }else{
                System.out.println("No fue agregado");
            }
        }

        System.out.println("----------------------------------");
    }

    //ACA SE MUESTRA LOS DIAS Y HORARIOS QUE TRABAJA UN ARBITRO
    public void mostrarLosHorariosQueTrabajoCadaDia() {
        for (DiaDeTrabajo d : diasQueTrabajo) {
            d.horarios();
        }
    }

    //ACA VERIFICAMOS SI LOS HORARIOS QUE SE PASARON EN UNA AGENDA ESTAN LIBRES O OCUPADOS
    public Agenda verificarSiEstaOcupado(Agenda a) {
        int i = 0;
        Agenda estaOcupado = null;

        while (i < this.diasQueFuiReservado.size() && estaOcupado == null) {
            Agenda aux = diasQueFuiReservado.get(i);
            if (aux.gethInicio().equals(a.gethInicio()) && aux.gethFinal().equals(a.gethFinal())) {
                if (aux.isEstaOcupado() != a.isEstaOcupado()) {
                    estaOcupado = aux;
                }
            }
            i++;
        }
        if (estaOcupado != null) {
            System.out.println("este horario esta ocupado:" + a.gethInicio() + "-" + a.gethFinal());

        } else {
            System.out.println("este horario esta libre:" + a.gethInicio() + "-" + a.gethFinal());

        }

        return estaOcupado;

    }

    
    //VERIFICA SI LA AGENDA QUE SE LE PASO PERTENECE A UNO DE LOS DIAS QUE TRABAJA EL ARBITRO(SOLO DIA);
    public boolean esteDiaDeLaSemanaTrabajo(LocalDateTime d) {
        DayOfWeek diaDeLaSemana = d.getDayOfWeek();
        boolean dEncontrado = false;
        int i = 0;
        while (i < diasQueTrabajo.size() && dEncontrado == false) {
            DayOfWeek aux = diasQueTrabajo.get(i).getNombre();
            if (diaDeLaSemana.equals(aux)) {
                dEncontrado = true;
            }
            i++;
        }

        return dEncontrado;
    }

    //verifica que las fechas que se le pasen sean lunes miercoles y viernes y verifican si la hora esta entre el horario que trabaja el arbitro
    public boolean trabajoEsteDia(LocalDateTime dia, LocalDateTime dFinal) {
        int i = 0;
        int j = 0;
        DiaDeTrabajo diaEncontrado = null;
        DayOfWeek d = dia.getDayOfWeek();
        int horario = dia.getHour();

        DiaDeTrabajo diaEncontradoFinal = null;
        DayOfWeek d2 = dFinal.getDayOfWeek();
        int horarioFinal = dFinal.getHour();

        boolean trabajoEsteDia = false;

        while (i < diasQueTrabajo.size() && diaEncontrado == null) {
            DiaDeTrabajo aux = diasQueTrabajo.get(i);
            if (d.equals(aux.getNombre())) {
                if (horario >= aux.getHoraEntrada().getHour() && horario <= aux.getHoraSalida().getHour()) {
                    diaEncontrado = aux;
                    System.out.println("Trabajo este horario incial");

                }else{
                                        System.out.println("No trabajo este horario inicial que eligio:"+horario);

                }
            }else{
                System.out.println("El dia: "+ d+" no trabajo");
            }
            i++;
        }

        while (j < diasQueTrabajo.size() && diaEncontradoFinal == null) {
            DiaDeTrabajo aux = diasQueTrabajo.get(j);
            if (d2.equals(aux.getNombre())) {
                if (horarioFinal >= aux.getHoraEntrada().getHour() && horarioFinal <= aux.getHoraSalida().getHour()) {
                    diaEncontradoFinal = aux;
                    System.out.println("Trabajo este horario final");
                }else{
                    System.out.println("No trabajo este horario final que eligio:"+horarioFinal);

                    
                }
            }else{
                    System.out.println("El dia: "+d+" no trabajo");

            }
            j++;
        }

        if (diaEncontrado != null && diaEncontradoFinal != null) {
            trabajoEsteDia = true;
        }
        return trabajoEsteDia;

    }

    //recorre l
    public void recorrerDiasQueEstanOcupados() {
        for (Agenda d : diasQueFuiReservado) {
            if (d.isEstaOcupado() != false) {
                System.out.println(d.gethInicio() + "-" + d.gethFinal());
            }

        }
        
    }

    //NOS MUESTRA CADA DIA QUE TRABAJO Y DE QUE HORA HASTA QUE HORA
    public void recorrerDiasQueTrabajo() {

        for (DiaDeTrabajo d : diasQueTrabajo) {

            System.out.println(d);

        }
    }

}
