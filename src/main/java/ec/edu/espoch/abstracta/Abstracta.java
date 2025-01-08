/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.abstracta;

import ec.edu.espoch.abstracta.animales.Animales;
import ec.edu.espoch.abstracta.animales.Gatos;
import ec.edu.espoch.abstracta.animales.Leones;
import ec.edu.espoch.abstracta.animales.Lobos;
import ec.edu.espoch.abstracta.animales.Perros;

/**
 *
 * @author PERSONAL
 */
public class Abstracta {

    public static void main(String[] args) {
        
        //Declarar un array de animales
        
   Animales[] animal = new Animales[4];
   
  animal[0] = new Gatos(); 
  animal[1] = new Leones(); 
  animal[2] = new Lobos(); 
  animal[4] = new Perros(); 
    
        for (int i = 0; i < animal.length; i++) {
            System.out.println("Su nombre cientifico es:" +animal[i].getnombreCientifico());
            
        }
    
    
    
    
    
    }
    
}
