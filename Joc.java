public class Joc {
    Combatents combatents;

    public void executar() {
        combatents = new Combatents();
        crearEquips();
        if (hiHanEquipsVius()) {
            combatents.torn();
        }
    }

    public boolean hiHanEquipsVius() {
        return combatents.equipsAmbVius() > 0;
    }

    public void crearEquips() {
        combatents.afegir(new EquipArquers("Equip arquers A"));
        combatents.afegir(new EquipArquers("Equip arquers B"));
        combatents.afegir(new EquipArquers("Equip arquers C"));
    }
}
