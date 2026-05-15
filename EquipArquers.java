public class EquipArquers extends Equip {
    public EquipArquers(String nom) {
        super(nom);
        personatges.add(new Arquer("Elowen", this));
        personatges.add(new Arquer("Thalion", this));
    }
}
