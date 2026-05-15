import java.util.ArrayList;

public class Combatents {
    private ArrayList<Equip> equips;

    public Combatents() {
        equips = new ArrayList<>();
    }

    public void afegir(Equip e) {
        equips.add(e);
    }

    public void torn() {
        for (Equip e : equips) {
            e.torn(this);
        }
    }

    public ArrayList<Personatge> obtenirPersonatges() {
        ArrayList<Personatge> personatges = new ArrayList<>();
        for (Equip e : equips) {
            personatges.addAll(e.getPersonatges());
        }
        return personatges;
    }

    public int equipsAmbVius() {
        int equipsVius = 0;
        for (Equip e : equips) {
            if (e.personatgesVius() > 0) {
                equipsVius++;
            }
        }
        return equipsVius;
    }
}
