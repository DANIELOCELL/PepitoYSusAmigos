public class Guerrer extends Personatge {
    public Guerrer(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void atacar(Personatge oponent) {
        atacarAmbMal(oponent, 20);
    }
}
