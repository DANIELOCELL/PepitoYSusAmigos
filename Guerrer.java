public class Guerrer extends Personatge {
    public Guerrer(String nom) {
        super(nom);
    }

    @Override
    public void atacar(Personatge oponent) {
        atacarAmbMal(oponent, 20);
    }
}
