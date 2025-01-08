/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.abstracta.animales;

/**
 *
 * @author PERSONAL
 */
public class Gatos extends Felinos{
    
    @Override
    public String getnombreCientifico() {
        return "esFelis silvestris catus";
    }
@Override
    public String getalimento() {
        return "Ratones";
    }

    @Override
    public String getsonido() {
        return "Maullido";
    }

    @Override
    public String gethabitat() {
        return "Doméstico";
    }
}
