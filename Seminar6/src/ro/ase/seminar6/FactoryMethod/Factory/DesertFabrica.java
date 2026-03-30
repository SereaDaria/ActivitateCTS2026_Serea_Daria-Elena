package ro.ase.seminar6.FactoryMethod.Factory;

import ro.ase.seminar6.FactoryMethod.Entity.*;

public class DesertFabrica implements FelDeMancareFabrica{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        if (tip.equals(TipDesert.PAPANASI)) {
            return new Papanasi(gramaj, denumire, calorii);
        } else if (tip.equals(TipDesert.CLATITE)) {
            return new Clatite(gramaj, denumire, calorii);
        }
        return null;
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip, gramaj, denumire, 500);
    }
}
