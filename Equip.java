import java.util.ArrayList;

public abstract class Equip {
    private String nom;
    protected ArrayList<Personatge> personatges;

    public Equip(String nom) {
        this.nom = nom;
        personatges = new ArrayList<>();
    }

    public void torn(Combatents combatents) {
        for (Personatge p : personatges) {
            if (p.esViu()) {
                p.torn(combatents);
            }
        }
    }

    public ArrayList<Personatge> getPersonatges() {
        return new ArrayList<>(personatges);
    }

    public int personatgesVius() {
        int vius = 0;
        for (Personatge p : personatges) {
            if (p.esViu()) {
                vius++;
            }
        }
        return vius;
    }
}
