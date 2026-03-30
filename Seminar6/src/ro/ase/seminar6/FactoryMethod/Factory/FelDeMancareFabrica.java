package ro.ase.seminar6.FactoryMethod.Factory;

import ro.ase.seminar6.FactoryMethod.Entity.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);

}
