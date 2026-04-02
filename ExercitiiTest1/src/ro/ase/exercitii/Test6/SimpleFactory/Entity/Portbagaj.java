package ro.ase.exercitii.Test6.SimpleFactory.Entity;

public class Portbagaj implements IComponenta {
    private float dimensiune;

    public Portbagaj(float dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseazaComponenta() {
        final StringBuilder sb = new StringBuilder("Portbagaj{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
