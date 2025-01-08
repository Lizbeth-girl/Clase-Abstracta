/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.abstracta.animales;

/**
 *
 * @author PERSONAL
 */
public class Lobos extends Caninos{
    
   @Override
    public String getnombreCientifico() {
        return "Canislupus";
    }
@Override
    public String getalimento() {
        return "Carnívoro";
    }

    @Override
    public String getsonido() {
        return "Aullido";
    }

    @Override
    public String gethabitat() {
        return "Bosque";
    } 
}
