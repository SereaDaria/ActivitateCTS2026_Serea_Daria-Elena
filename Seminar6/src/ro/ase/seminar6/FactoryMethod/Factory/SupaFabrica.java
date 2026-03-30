package ro.ase.seminar6.FactoryMethod.Factory;

import ro.ase.seminar6.FactoryMethod.Entity.Ciorba;
import ro.ase.seminar6.FactoryMethod.Entity.FelDeMancare;
import ro.ase.seminar6.FactoryMethod.Entity.SupaCrema;
import ro.ase.seminar6.FactoryMethod.Factory.TipSupa;

public class SupaFabrica implements FelDeMancareFabrica {

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        if (tip.equals(TipSupa.SUPA_CREMA)) {
            return new SupaCrema(gramaj, denumire);
        } else if (tip.equals(TipSupa.CIORBA)) {
            return new Ciorba(gramaj, denumire);
        }
        return null;
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tip, gramaj, denumire);
    }
}
