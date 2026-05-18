public class ExercitMinioms extends Personatge {

    private int minioms = 30;
    private int danyAcumulat = 0;

    public ExercitMinioms(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void rebreMal(int mal) {
        int blocsAbans = danyAcumulat / 40;
        danyAcumulat += mal;
        minioms += ((danyAcumulat / 40) - blocsAbans) * 4;
        super.rebreMal(mal);
    }

    @Override
    public void ferAccio(Personatge oponent) {
        atacarAmbMal(oponent, Dau.tirar(10) <= 3 ? minioms : minioms / 2);
    }
}
