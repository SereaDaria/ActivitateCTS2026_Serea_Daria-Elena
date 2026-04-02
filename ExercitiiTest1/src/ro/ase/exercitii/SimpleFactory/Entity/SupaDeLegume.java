package ro.ase.exercitii.SimpleFactory.Entity;

public class SupaDeLegume implements Supa {
    private float pret;

    public SupaDeLegume(float pret) {
        this.pret = pret;
    }

    @Override
    public void afiseazaSupa() {
        final StringBuilder sb = new StringBuilder("SupaDeLegume{");
        sb.append("pret='").append(pret).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
