package modelop1;

public class Cliente {

    private String DNI;
    private String apellido;

    public Cliente(String DNI, String apellido) {
        this.DNI = DNI;
        this.apellido = apellido;
    }
    
    public String getDNI() {
        return this.DNI;
    }

    public String getApellido() {
        return apellido;
    }
    

    public double getDescuento(){
        return 0;
    }
    
    
  
}
