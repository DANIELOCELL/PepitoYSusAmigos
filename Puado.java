public class Puado extends Personatge {

    public Puado(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void atacar(Personatge oponent) {
        int tirada = Dau.tirar(3);

        int mal;
        if (tirada == 1) {
            mal = 40;
        } else {
            mal = 10;
        }

        atacarAmbMal(oponent, mal);
    }
}