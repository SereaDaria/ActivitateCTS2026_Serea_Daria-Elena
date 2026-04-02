package ro.ase.exercitii.Recap.SimpleFactory.Entity;

public class SupaCrema implements Supa {
    private String nume;
    private int pret;

    public SupaCrema(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afisareSupa() {
        final StringBuilder sb = new StringBuilder("SupaCrema{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
