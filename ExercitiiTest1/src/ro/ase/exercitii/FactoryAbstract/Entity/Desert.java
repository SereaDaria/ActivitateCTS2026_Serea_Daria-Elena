package ro.ase.exercitii.FactoryAbstract.Entity;

public abstract class Desert implements FelDeMancare {
    protected String nume;
    protected float pret;
    protected int cantitate;

    public Desert(String nume, float pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }
}
