/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoejercicio8.metodoDePago;

/**
 *
 * @author Matias
 */
public abstract class ConDemora extends MetodoDePago {
    
    private int diasDeDemoraEnElCobro;

    public ConDemora(String descripcion, int diasDeDemoraEnElCobro) {
        super(descripcion);
        this.diasDeDemoraEnElCobro = diasDeDemoraEnElCobro;
    }
    public int getDiasDeDemoraEnElCobro() {
        return diasDeDemoraEnElCobro;
    }
    
    
    
    
  
    
}
