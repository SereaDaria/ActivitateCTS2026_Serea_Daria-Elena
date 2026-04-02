package ro.ase.exercitii.SimpleFactory.Entity;

public class SupaDeCiuperci implements Supa {
    private float pret;

    public SupaDeCiuperci(float pret) {
        this.pret = pret;
    }

    @Override
    public void afiseazaSupa() {
            final StringBuilder sb = new StringBuilder("SupaDeCiuperci{");
            sb.append("pret=").append(pret);
            sb.append('}');
            System.out.println(sb.toString());
    }

}
