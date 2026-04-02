package ro.ase.exercitii.Recap.Prototype;

public class Rezervare implements IRezervare {
    private String numeClient;
    private int nrTelefon;

    public Rezervare(String numeClient, int nrTelefon) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
    }

    public Rezervare() {
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrTelefon(int nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Rezervare copiaza() {
       Rezervare rezervare = new Rezervare();
       rezervare.numeClient = this.numeClient;
       rezervare.nrTelefon = this.nrTelefon;
       return rezervare;
    }
}
