package ro.ase.exercitii.Test6.SimpleFactory.Entity;

public class Bara implements IComponenta {
    private float dimensiune;

    public Bara(float dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseazaComponenta() {
        final StringBuilder sb = new StringBuilder("Bara{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
