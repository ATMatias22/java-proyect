package modelop1;

public class Reserva {

    private static int ultNroReserva = 100;
    // TODO Atributos...
    public final static double PRECIO_POR_ESTACION = 50;
    public final static Estacion ESTACION_INICIAL = Estacion.BUENOS_AIRES; 
    public final static Estacion ESTACION_FINAL = Estacion.BRAGADO; 
    
    private int idReserva;
    private Estacion estacionSalida;
    private Estacion estacionDestino;
    private Cliente cliente;

    public Reserva(Estacion estacionSalida, Estacion estacionDestino, String dni, String apellido) {
        this.idReserva = generarID();
        this.estacionSalida = estacionSalida;
        this.estacionDestino = estacionDestino;
        this.cliente = new Cliente(dni, apellido);
    }
    
      public Reserva(Estacion estacionSalida, Estacion estacionDestino, String dni, String apellido,Genero genero) {
        this.idReserva = generarID();
        this.estacionSalida = estacionSalida;
        this.estacionDestino = estacionDestino;
      
        this.cliente = new Jubilado(dni, apellido, genero);
    }
      
       public Reserva(Estacion estacionSalida, Estacion estacionDestino, String dni, String apellido,int edad) {
        this.idReserva = generarID();
        this.estacionSalida = estacionSalida;
        this.estacionDestino = estacionDestino;
        this.cliente = new Nene(dni, apellido, edad);
    }
    
    // TODO Constructor/es. El n�mero de reserva debe ser autoincremental.
    private int generarID() {
        Reserva.ultNroReserva++;
        return Reserva.ultNroReserva;
    }
    
    private int calcularEstacionesRecorridas(){
        int nroSalida = estacionSalida.ordinal();
        int nroDestino = estacionDestino.ordinal();
        return Math.abs(nroSalida - nroDestino);
    }
    
    public  boolean recorriDeInicioAFin(){
        return calcularEstacionesRecorridas() == (Empresa.CANTIDAD_ESTACIONES-1) ;
    }

    public double calcularPrecio() {
        // TODO Implementar...
        double totalConDescuento = calcularEstacionesRecorridas() * PRECIO_POR_ESTACION;
        return Descuento.descuento(totalConDescuento, this.cliente.getDescuento()); // Modificar por el valor correcto
    }

    @Override
    public String toString() {
        return "#" + idReserva + " - De " + estacionSalida + " a " + estacionDestino ;
    }

  
    
    
    
}
