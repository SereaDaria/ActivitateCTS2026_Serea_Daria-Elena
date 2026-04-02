package ro.ase.exercitii.Test2.Builder;

public class Rezervare {
    private String numeClient;
    private boolean cascaProtectie;
    private boolean cosCumparaturi;
    private boolean asigurareAccidente;
    private int nrKmInclusi;

    public Rezervare(String numeClient, boolean cascaProtectie, boolean asigurareAccidente, boolean cosCumparaturi, int nrKmInclusi) {
        this.numeClient = numeClient;
        this.cascaProtectie = cascaProtectie;
        this.asigurareAccidente = asigurareAccidente;
        this.cosCumparaturi = cosCumparaturi;
        this.nrKmInclusi = nrKmInclusi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", cascaProtectie=").append(cascaProtectie);
        sb.append(", cosCumparaturi=").append(cosCumparaturi);
        sb.append(", asigurareAccidente=").append(asigurareAccidente);
        sb.append(", nrKmInclusi=").append(nrKmInclusi);
        sb.append('}');
        return sb.toString();
    }
}
