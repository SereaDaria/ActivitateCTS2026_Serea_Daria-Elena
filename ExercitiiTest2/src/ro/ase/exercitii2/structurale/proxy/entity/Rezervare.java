package ro.ase.exercitii2.structurale.proxy.entity;

public class Rezervare implements IRezervare {
    private int nrRezervare;
    private String nume;
    private int nrPersoane;

    public Rezervare(int nrRezervare, String nume, int nrPersoane) {
        this.nrRezervare = nrRezervare;
        this.nume = nume;
        this.nrPersoane = nrPersoane;
    }

    public int getNrRezervare() {
        return nrRezervare;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }


    @Override
    public void realizeazaRezervare() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
