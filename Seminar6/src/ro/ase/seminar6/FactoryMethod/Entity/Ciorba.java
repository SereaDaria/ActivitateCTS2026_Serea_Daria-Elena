package ro.ase.seminar6.FactoryMethod.Entity;

public class Ciorba extends Supa{

    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaFelDeMancare() {
        System.out.println("Ciorba " + super.denumire + " are " + super.gramaj + " grame");
    }
}
