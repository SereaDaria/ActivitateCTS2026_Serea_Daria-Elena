package ro.ase.exercitii.Test6.SimpleFactory.Entity;

public class Usa implements IComponenta {
    private float dimensiune;

    public Usa(float dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseazaComponenta() {
        final StringBuilder sb = new StringBuilder("Usa{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
