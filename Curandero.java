import java.util.ArrayList;

public class Curandero extends Personatge {

    private static final int CURACIO_COMPANY = 20;
    private static final int CURACIO_PROPIA = 10;
    private static final int DANY_ATAC = 15;

    public Curandero(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void torn(Combatents combatents) {
        System.out.println();
        System.out.println("És el torn de " + getNom() + " (Curandero)");
        UI.mostrarPersonatgesIVida(combatents.obtenirPersonatges());

        int accio = UI.escollirAccioCurandero(getNom());

        if (accio == 1) {
            ArrayList<Personatge> companysVius = new ArrayList<>();
            for (Personatge p : getEquip().getPersonatges()) {
                if (p.esViu() && p != this) {
                    companysVius.add(p);
                }
            }

            if (companysVius.isEmpty()) {
                UI.mostrarCuracio(this, this, CURACIO_PROPIA);
                this.curar(CURACIO_PROPIA);
            } else {
                Personatge company = UI.escollirCompanyACurar(companysVius);
                UI.mostrarCuracio(this, company, CURACIO_COMPANY);
                company.curar(CURACIO_COMPANY);
            }

        } else {
            Personatge oponent = UI.escollirOponent(this, combatents.obtenirPersonatges());
            ferAccio(oponent);
        }
    }

    @Override
    public void ferAccio(Personatge oponent) {
        atacarAmbMal(oponent, DANY_ATAC);
    }
}
