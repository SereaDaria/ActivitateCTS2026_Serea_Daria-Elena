package ro.ase.exercitii.Builder.Entity;

public class Rezervare {
    private String numeClient;
    private boolean masaGeam;
    private boolean scaunCopil;
    private boolean decoratiuniFlorale;

    public Rezervare(String numeClient, boolean masaGeam, boolean scaunCopil, boolean decoratiuniFlorale) {
        this.numeClient = numeClient;
        this.masaGeam = masaGeam;
        this.scaunCopil = scaunCopil;
        this.decoratiuniFlorale = decoratiuniFlorale;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", masaGeam=").append(masaGeam);
        sb.append(", scaunCopil=").append(scaunCopil);
        sb.append(", decoratiuniFlorale=").append(decoratiuniFlorale);
        sb.append('}');
        return sb.toString();
    }
}
