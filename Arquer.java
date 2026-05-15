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

    @Override
    public void atacar(Personatge oponent) {
        if (fletxes > 0) {
            int mal = Dau.tirar(20) + 20;
            atacarAmbMal(oponent, mal);
            fletxes--;
            if (fletxes<=0) {
                rondesPendentsPerFabricar = RONDES_PER_FABRICAR;
            }
        }
        else {
            rondesPendentsPerFabricar--;
            if (rondesPendentsPerFabricar == 0) {
                fletxes = FLETXES_INICIALS;
            }
        }
    }
}
