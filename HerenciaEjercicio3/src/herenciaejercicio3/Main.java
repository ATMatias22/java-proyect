/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio3;

import herenciaejercicio3.archivo.Video;
import herenciaejercicio3.musica.FormatoVideo;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Video v = new Video("Clase1", 50, "C:/User/Mati/Desktop", true, 5.50, true, FormatoVideo.MP4, 1020, 1980);
        System.out.println(v.toString());

        
    }
    
}
