package ec.edu.espoch.abstracta.animales;

public class Perros extends Caninos {

    @Override
    public String getnombreCientifico() {
        return "Canislipus";
    }
@Override
    public String getalimento() {
        return "Carnívoro";
    }

    @Override
    public String getsonido() {
        return "Ladrido";
    }

    @Override
    public String gethabitat() {
        return "Doméstico";
    }
}
