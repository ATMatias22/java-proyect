/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3.archivo;

/**
 *
 * @author Matias
 */
public class Texto extends Archivo {
    
    private String codificacion;

    public Texto(String nombre, double peso, String localizacion, boolean estaAbierto,String codificacion) {
        super(nombre, peso, localizacion, estaAbierto);
        this.codificacion = codificacion;
    }

    public String getCodificacion() {
        return codificacion;
    }
    
    
    
    
    
    
}
