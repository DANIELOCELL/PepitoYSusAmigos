public class Arquer extends Personatge {
    private final int FLETXES_INICIALS = 4;
    private final int RONDES_PER_FABRICAR = 4;
    private int fletxes;
    private int rondesPendentsPerFabricar;

    public Arquer(String nom, Equip equip) {
        super(nom, equip);
        fletxes = FLETXES_INICIALS;
        rondesPendentsPerFabricar = 0;
    }

    // TO DO: Repensar aquest mètode, ja que no sempre ataca.
    @Override
    public void atacar(Personatge oponent) {
        if (potAtacar()) {
            int mal = Dau.tirar(20) + 20;
            atacarAmbMal(oponent, mal);
            fletxes--;
            if (fletxes<=0) {
                comencarAFabricar();
            }
        }
        else {
            fabricar();
        }
    }

    private boolean potAtacar() {
        return fletxes > 0;
    }

    private void comencarAFabricar() {
        rondesPendentsPerFabricar = RONDES_PER_FABRICAR;
    }

    private void fabricar() {
        rondesPendentsPerFabricar--;
        if (rondesPendentsPerFabricar == 0) {
            fletxes = FLETXES_INICIALS;
        }
    }
}
