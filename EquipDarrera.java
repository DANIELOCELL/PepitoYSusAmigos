public class EquipDarrera extends Equip {
    public EquipDarrera(String nom) {
        super(nom);
        afegirPersonatge(new Morthex("Gerald", this));
        afegirPersonatge(new PokoMoko("Eloi", this));
        afegirPersonatge(new Curandero("Lucia", this));
    }
}
