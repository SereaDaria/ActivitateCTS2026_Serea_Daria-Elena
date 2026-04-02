package ro.ase.exercitii.FactoryAbstract.Factory;

import ro.ase.exercitii.FactoryAbstract.Entity.FelDeMancare;

public interface FelDeMancareFactory {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, String nume, float pret);
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, String nume, float pret, int cantitate);
}
