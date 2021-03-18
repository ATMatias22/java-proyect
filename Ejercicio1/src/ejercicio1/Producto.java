/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Matias
 */
public class Producto {
    
    private String ID;
    private double precio;
    private String descripcion;
    private Categoria categoria;

    public Producto(String ID, double precio, String descripcion, Categoria categoria) {
        this.ID = ID;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
    
    public void mostrar(){
        
        System.out.println(this.descripcion+"\t"+ this.precio+"\t"+ this.categoria);
        
    }

    public String getID() {
        return ID;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", precio=" + precio + ", descripcion=" + descripcion + ", categoria=" + categoria + '}';
    }
    
    
    
    
    
    
}
