public class PokoMoko extends Personatge{

    public PokoMoko (String nom, Equip equip){
        super (nom, equip);
    }

    @Override
    public void ferAccio (Personatge oponent) {
        int mal = Dau.tirar(10);
        atacarAmbMal(oponent, mal);
        augmentarMalFet(mal);
    }

    @Override
    public void rebreMal(int mal){
        int malAcabat = mal;

        if (Dau.tirar(2) == 1){
            malAcabat = Dau.tirar(mal +1);
            System.out.println("S'ha defentat, mal reduit a:" + malAcabat);
        }

        super.rebreMal(malAcabat);
    }
}