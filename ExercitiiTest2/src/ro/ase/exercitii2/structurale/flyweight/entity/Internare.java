package ro.ase.exercitii2.structurale.flyweight.entity;

public class Internare {
    private int nrSalon;
    private int nrPat;
    private int nrZile;

    public Internare(int nrSalon, int nrPat, int nrZile) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZile() {
        return nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZile=").append(nrZile);
        sb.append('}');
        return sb.toString();
    }
}
