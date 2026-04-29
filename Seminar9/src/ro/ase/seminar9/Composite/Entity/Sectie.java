package ro.ase.seminar9.Composite.Entity;

public class Sectie implements Structura {
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }


    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
