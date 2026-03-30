package ro.ase.seminar6.FactoryMethod.Entity;

public abstract class Desert implements FelDeMancare {
    protected float gramaj;
    protected String denumire;
    protected int calorii;

    public Desert(float gramaj, String denumire, int calorii) {
        this.gramaj = gramaj;
        this.denumire = denumire;
        this.calorii = calorii;
    }
}
