package ro.ase.seminar6.FactoryMethod.Entity;

public class SupaCrema extends Supa{

    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaFelDeMancare() {
        System.out.println("SupaCrema " + super.denumire + " are " + super.gramaj + " grame");
    }
}
