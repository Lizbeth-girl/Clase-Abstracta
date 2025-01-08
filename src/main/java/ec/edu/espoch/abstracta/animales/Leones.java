/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.abstracta.animales;

/**
 *
 * @author PERSONAL
 */
public class Leones extends Felinos{
 
    @Override
    public String getnombreCientifico() {
        return "Panthera Leo";
    }
@Override
    public String getalimento() {
        return "Carnívoro";
    }

    @Override
    public String getsonido() {
        return "Rugido";
    }

    @Override
    public String gethabitat() {
        return "Pradera";
    }
}
