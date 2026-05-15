public class Joc {
    Combatents combatents;

    public void executar() {
        combatents = new Combatents();
        crearEquips();
        if (combatents.equipsAmbVius() > 1) {
            combatents.torn();
        }
    }

    public void crearEquips() {
        combatents.afegir(new EquipArquers("Equip arquers"));
        combatents.afegir(new EquipArquerIGuerrer("Equip mixt"));
        combatents.afegir(new EquipGuerrers("Equip guerrers"));
    }
}
