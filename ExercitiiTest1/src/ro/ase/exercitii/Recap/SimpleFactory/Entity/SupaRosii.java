package ro.ase.exercitii.Recap.SimpleFactory.Entity;

public class SupaRosii implements Supa {
    private String nume;
    private int pret;
    private int gramaj;

    public SupaRosii(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;

    }

    @Override
    public void afisareSupa() {
        final StringBuilder sb = new StringBuilder("SupaRosii{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
