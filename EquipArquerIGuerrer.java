public class EquipArquerIGuerrer extends Equip {
    public EquipArquerIGuerrer(String nom) {
        super(nom);
        personatges.add(new Arquer("Alys", this));
        personatges.add(new Guerrer("Borguin", this));
    }
}
