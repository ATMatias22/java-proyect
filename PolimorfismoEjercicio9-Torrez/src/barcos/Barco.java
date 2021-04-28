/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcos;


/**
 *
 * @author Matias
 */
public abstract class Barco {
    
    private String matricula;
    private double esloraEnMts;
    private int anioDeFabricacion;
    private String nomDuenio;
    private double valorBase;
    private double valorAdicional;

    public Barco(String matricula, double esloraEnMts, int anioDeFabricacion, String nomDuenio, double valorBase, double valorAdicional) {
        this.matricula = matricula;
        this.esloraEnMts = esloraEnMts;
        this.anioDeFabricacion = anioDeFabricacion;
        this.nomDuenio = nomDuenio;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public double getEsloraEnMts() {
        return esloraEnMts;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public String getNomDuenio() {
        return nomDuenio;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double getPrecioBase(){
        return this.valorBase*esloraEnMts;
    }
    
    public abstract double getPrecioAdicional();
    
    public  double total(){
        return getPrecioBase() + getPrecioAdicional();
    }

    @Override
    public String toString() {
        return "Barco:\n" + "matricula=" + matricula + "\nesloraEnMts=" + esloraEnMts + "\nanioDeFabricacion=" + anioDeFabricacion + "\nnomDuenio=" + nomDuenio + "\nvalorBase=" + valorBase + "\nvalorAdicional=" + valorAdicional ;
    }
    
   
    
    
}
