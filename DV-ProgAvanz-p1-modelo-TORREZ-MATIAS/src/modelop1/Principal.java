package modelop1;

public class Principal {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        System.out.print("El precio promedio de pasaje es: ");
        System.out.println(empresa.precioPromedioReserva());

        System.out.println("\nReservas que fueron de cabecera a cabecera:");
        empresa.mostrarReservasCabeceraACabecera();
        
    }
}
