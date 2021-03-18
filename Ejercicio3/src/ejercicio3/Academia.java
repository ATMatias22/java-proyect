/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Academia {
    
    private ArrayList<Curso> cursos;
    
    
    public Academia(){
        
        cursos = new ArrayList<>();
        
    }
    
    public void agregarCurso(Curso c){
        
        cursos.add(c);
        
    }
    
       
    
}
