/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Inmobiliaria {
    
    private ArrayList <Barrio> barrios;

    public Inmobiliaria() {
        this.barrios = new ArrayList<>();
    }
    
    public void agregarBarrio(Barrio b){
        
        this.barrios.add(b);
    }
    
    public void mostrarPropiedades(Tipo t){
        
        for (Barrio b : this.barrios) {
            b.mostrarPropiedades(t);
        }
        
    }
    
    //punto C
    //MOSOTRAMOS LAS PROPIEDADES DE TODOS LOS BARRIOS
    public void mostrarPropiedades(){
        for (Barrio b : this.barrios) {
          b.mostrarPropiedades();
        }
    }
    
    
    //FUNCION QUE AYUDA EN EL PUNTO D
    //BUSCAMOS CUAL ES LA CANTIDAWD MAS ALTA DE PROPIEDADES DE TODOS LOS BARRIOS
    private int cantPropQueTieneElBarrioConMasProp(){
        int max = 0;
        for (Barrio b : this.barrios) {
           if(b.cantidadPropiedades() > max){
               max = b.cantidadPropiedades();
           }
        }
        
        return max;
    }
    
    //PUNTO D
    //USAMOS LA FUNCION cantPropQueTieneElBarrioConMasProp QUE NOS RETORNA CUAL DE LOS BARRIOS TIENE MAS PROPIEDADES
    //Y COMPARAMOS CADA BARRIO CON ESE MAXIMO Y SI ES LA MISMA CANTIDAD, LO METEMOS EN EL ARRAYLIST
    public ArrayList<Barrio> obtenerBarrioMaxProp(){
        ArrayList<Barrio> aux = new ArrayList<>();
        for (Barrio b : this.barrios) {
            if(b.cantidadPropiedades() == cantPropQueTieneElBarrioConMasProp()){
                aux.add(b);
            }
        }
        
        System.out.println("El barrio con mas propiedades tiene "+ cantPropQueTieneElBarrioConMasProp() + " Propiedades");

        return aux;
    }
    
    //PUNTO E
    //ESTA FUNCION RETORNA UNA PROPIEDAD O NULL, SI ENCUENTRA UNA PROPIEDAD LA ELIMINA Y LA RETORNA
    public Propiedad borrarPropiedad(String domicilio){
        int i = 0;
        Propiedad aux = null;
        while(i < this.barrios.size() && aux == null){
            aux  = this.barrios.get(i).eliminarPropiedad(domicilio);
            i++;
        }
        if(aux == null){
            System.out.println("No se encontro domicilio: "+ domicilio+ " en ningun barrio");
        }else{
            //colocamos --i ya que el i va a estar un indice mas arriba ya que primero guardamos una propiedad y luego suma
            String barrioEncontrado =  this.barrios.get(--i).getNombre();
            System.out.println("se borro domicilio: "+ aux+ " del barrio: "+ barrioEncontrado);
        }
        
        return aux;
    }
    
    //PUNTO F
    //ACA USAMOS LA FUNCION BORRARPROPIEDAD, Y SI EXISTE EL DOMICILIO QUE SE PASO POR PARAMETRO, LA FUNCION 
    //BORRARPROPIEDAD DEVOLVERA UNA PROPIEDAD Y SINO NULL;
    public void cambiarPropiedadDeBarrio(String domicilio,Barrio b){
       Propiedad moverProp = borrarPropiedad(domicilio);
        if( moverProp != null){
            System.out.println("Se movio correctamente la propiedad: "+ moverProp);
            b.agregarPropiedad(moverProp);
        }else{
            System.out.println("No es posible mover un domicilio que no existe");
        }
        
        
        
    }
    

    
    
    
    
}
