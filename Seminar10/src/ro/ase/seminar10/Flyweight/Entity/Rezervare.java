package ro.ase.seminar10.Flyweight.Entity;

public class Rezervare {
    private int nrMasa;
    private String oraRezervare;
    private int nrPersoane;

    public Rezervare(int nrMasa, String oraRezervare, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.oraRezervare = oraRezervare;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

}
