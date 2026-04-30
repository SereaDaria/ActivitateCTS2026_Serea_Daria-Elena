package ro.ase.seminar9.Composite.Entity;

public class Sectie implements Structura {
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }


    @Override
    public void afiseazaDetalii(String spatii) {
        final StringBuilder sb = new StringBuilder(spatii + "Sectie{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
