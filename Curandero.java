public class Curandero extends Personatge {

    private static final int CURACIO_COMPANY = 20;
    private static final int CURACIO_PROPIA = 10;
    private static final int DANY_ATAC = 15;

    public Curandero(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio(Personatge oponent) {
        int tirada = Dau.tirar(10);
        if (tirada <= 4) {
            curarCompany();
        } else if (tirada <= 6) {
            curarSeMate();
        } else {
            atacarAmbMal(oponent, DANY_ATAC);
        }
    }

    private void curarCompany() {
        for (Personatge p : getEquip().getPersonatges()) {
            if (p.esViu() && p != this) {
                p.rebreMal(-CURACIO_COMPANY);
                return;
            }
        }
    }

    private void curarSeMate() {
        this.rebreMal(-CURACIO_PROPIA);
    }
}
