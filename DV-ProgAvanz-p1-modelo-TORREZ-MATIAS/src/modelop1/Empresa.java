package modelop1;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Reserva> reservas;
    public final static int CANTIDAD_ESTACIONES = Estacion.values().length;

    public Empresa() {
        // Cuando la empresa se crea, deben generarse las reservas...
        // Ver abajo 'generarReservas()'
        reservas = new ArrayList<>();
        generarReservas();
    }

    public double precioPromedioReserva() {
        double total = 0;
        for (Reserva r : reservas) {
            total += r.calcularPrecio();
        }

        return this.reservas.size() > 0 ? total/this.reservas.size() : 0 ; // Modificar por el valor correcto
    }

    public void mostrarReservasCabeceraACabecera() {
        // TODO Implementar...
         for (Reserva r : reservas) {
             if(r.recorriDeInicioAFin()){
                 System.out.println(r.toString() +"  " +r.calcularPrecio());
             }
        }
    }

    ////////////////////////////////// NO TOCAR ///////////////////////////////////
    private void generarReservas() {
        this.reservas.add(new Reserva(Estacion.CHIVILCOY, Estacion.BUENOS_AIRES, "15075243", "Martnez"));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.CHIVILCOY, "15154271", "Vera"));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.SUIPACHA, "15349487", "Mesa", Genero.FEMENINO));
        this.reservas.add(new Reserva(Estacion.CHIVILCOY, Estacion.MERCEDES, "15053774", "Graf", 7));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.ALBERTI, "15067512", "Manca"));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.BUENOS_AIRES, "15074676", "Salinas"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.SUIPACHA, "15041655", "Valenciano", 4));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.SUIPACHA, "15079363", "Acevedo"));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.ALBERTI, "15359258", "Venegas", Genero.FEMENINO));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.BUENOS_AIRES, "15082146", "Navarro"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.ALBERTI, "15082499", "Arias"));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.BRAGADO, "15088521", "Vanegas"));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.MERCEDES, "15121711", "Allen"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.SUIPACHA, "15010493", "Vallejo", 6));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.CHIVILCOY, "15132049", "Serra"));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.MERCEDES, "15339514", "Nardi", Genero.FEMENINO));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.ALBERTI, "15133578", "Pacheco"));
        this.reservas.add(new Reserva(Estacion.ALBERTI, Estacion.BUENOS_AIRES, "15348679", "Shimizu", Genero.FEMENINO));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.LUJAN, "15155364", "Delgado"));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.CHIVILCOY, "15358596", "Sanson", Genero.FEMENINO));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.MERCEDES, "15156389", "Andrade"));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.BUENOS_AIRES, "15157521", "Aguilar"));
        this.reservas.add(new Reserva(Estacion.ALBERTI, Estacion.SUIPACHA, "15164163", "Ortega"));
        this.reservas.add(new Reserva(Estacion.CHIVILCOY, Estacion.BRAGADO, "15017738", "Weiss", 3));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.LUJAN, "15387567", "Bianchi", Genero.MASCULINO));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.BRAGADO, "15166573", "Oliva"));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.ALBERTI, "15000526", "Neumann", 8));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.ALBERTI, "15185873", "Foster"));
        this.reservas.add(new Reserva(Estacion.ALBERTI, Estacion.LUJAN, "15188106", "Palma"));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.ALBERTI, "15188377", "Calvo"));
        this.reservas.add(new Reserva(Estacion.CHIVILCOY, Estacion.MERCEDES, "15210898", "Medrano"));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.SUIPACHA, "15341996", "Orozco", Genero.MASCULINO));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.BRAGADO, "15229013", "Ruiz"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.ALBERTI, "15230598", "Sales"));
        this.reservas.add(new Reserva(Estacion.SUIPACHA, Estacion.BUENOS_AIRES, "15236993", "Cantu"));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.BUENOS_AIRES, "15408689", "Freire", Genero.MASCULINO));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.BRAGADO, "15237428", "Rivas"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.SUIPACHA, "15241702", "Luna"));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.SUIPACHA, "15027527", "Barrera", 5));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.BUENOS_AIRES, "15278229", "Muoz"));
        this.reservas.add(new Reserva(Estacion.ALBERTI, Estacion.BRAGADO, "15285043", "Galvez"));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.BRAGADO, "15288456", "Batista"));
        this.reservas.add(new Reserva(Estacion.ALBERTI, Estacion.BUENOS_AIRES, "15418182", "Mele", Genero.FEMENINO));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.SUIPACHA, "15054311", "Leon", 5));
        this.reservas.add(new Reserva(Estacion.LUJAN, Estacion.SUIPACHA, "15300326", "Arenas"));
        this.reservas.add(new Reserva(Estacion.CHIVILCOY, Estacion.MERCEDES, "15307491", "Rubio"));
        this.reservas.add(new Reserva(Estacion.BRAGADO, Estacion.BUENOS_AIRES, "15318268", "Mello"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.BUENOS_AIRES, "15328413", "Garcia"));
        this.reservas.add(new Reserva(Estacion.MERCEDES, Estacion.MERCEDES, "15066836", "Linares", 2));
        this.reservas.add(new Reserva(Estacion.BUENOS_AIRES, Estacion.SUIPACHA, "15335745", "Ruggeri"));
    }
}
