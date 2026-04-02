package ro.ase.exercitii.Recap.Builder.Entity;

public class Rezervare {
    private String numeClient;
    private boolean locGeam;
    private boolean aranjamentFloral;

    public Rezervare(String numeClient, boolean locGeam, boolean aranjamentFloral) {
        this.numeClient = numeClient;
        this.locGeam = locGeam;
        this.aranjamentFloral = aranjamentFloral;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", locGeam=").append(locGeam);
        sb.append(", aranjamentFloral=").append(aranjamentFloral);
        sb.append('}');
        return sb.toString();
    }


}
