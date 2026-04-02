package ro.ase.exercitii.Test6.SimpleFactory.Entity;

public class Capota implements IComponenta {
    private float dimensiune;

    public Capota(float dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseazaComponenta() {
        final StringBuilder sb = new StringBuilder("Capota{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
