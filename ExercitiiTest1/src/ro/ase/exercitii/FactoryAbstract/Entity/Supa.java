package ro.ase.exercitii.FactoryAbstract.Entity;

public abstract class Supa implements FelDeMancare{
    protected String nume;
    protected float pret;

    public Supa(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }
}
