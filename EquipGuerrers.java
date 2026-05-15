public class EquipGuerrers extends Equip {
    public EquipGuerrers(String nom) {
        super(nom);
        personatges.add(new Guerrer("Kaelen", this));
        personatges.add(new Guerrer("Morvath", this));
    }
}
