package ro.ase.exercitii.Test3.Builder;

public class Rezervare{
    private String numeClient;
    private boolean masaGeam;
    private boolean scaunCopil;
    private boolean flori;
    private String muzica;

    public Rezervare(String numeClient, boolean masaGeam, boolean scaunCopil, boolean flori, String muzica) {
        this.numeClient = numeClient;
        this.masaGeam = masaGeam;
        this.scaunCopil = scaunCopil;
        this.flori = flori;
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", masaGeam=").append(masaGeam);
        sb.append(", scaunCopil=").append(scaunCopil);
        sb.append(", flori=").append(flori);
        sb.append(", muzica='").append(muzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
