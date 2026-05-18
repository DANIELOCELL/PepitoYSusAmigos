public class MissDanger extends Personatge {
    private int mal;
    private boolean invulnerableProximAtac;

    public MissDanger(String nom, Equip equip) {
        super(nom, equip);
        this.mal = Dau.tirar(30);
        this.invulnerableProximAtac = false;
    }

    @Override
    public void atacar(Personatge oponent) {
        if (esViu()) {
            atacarAmbMal(oponent, mal);
        }
    }

    @Override
    public void rebreMal(int mal) {
        if (invulnerableProximAtac) {
            invulnerableProximAtac = false;
        } else {
            super.rebreMal(mal);
        }
    }

    @Override
    public void torn(Combatents combatents) {
        int probabilitat = Dau.tirar(2);
        if (probabilitat == 1) {
            invulnerableProximAtac = true;
        }

        super.torn(combatents);
    }
}