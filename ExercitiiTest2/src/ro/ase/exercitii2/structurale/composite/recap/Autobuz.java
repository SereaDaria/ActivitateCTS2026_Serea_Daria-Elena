package ro.ase.exercitii2.structurale.composite.recap;

public class Autobuz implements IFlota {
    private int nrAutobuz;
    private int nrLocuri;

    public Autobuz(int nrAutobuz, int nrLocuri) {
        this.nrAutobuz = nrAutobuz;
        this.nrLocuri = nrLocuri;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public void afiseaza() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrAutobuz=").append(nrAutobuz);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
