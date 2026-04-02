package ro.ase.exercitii.SimpleFactory.Entity;

public class SupaDeVita implements Supa {
    private float pret;

    public SupaDeVita(float pret) {
        this.pret = pret;
    }

    @Override
    public void afiseazaSupa() {
        final StringBuilder sb = new StringBuilder("SupaDeVita{");
        sb.append("pret=").append(pret);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
