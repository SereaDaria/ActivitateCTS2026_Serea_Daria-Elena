package ro.ase.exercitii.Test3.Builder;

public class RezervareBuilder implements IRezervareBuilder {
    private boolean masaGeam;
    private boolean scaunCopil;
    private boolean flori;
    private String muzica;

    public RezervareBuilder() {
        this.masaGeam = false;
        this.scaunCopil = false;
        this.flori = false;
        this.muzica = "NU";
    }

    public RezervareBuilder setMasaGeam(boolean masaGeam) {
        this.masaGeam = masaGeam;
        return this;
    }

    public RezervareBuilder setScaunCopil(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
        return this;
    }

    public RezervareBuilder setFlori(boolean flori) {
        this.flori = flori;
        return this;
    }

    public RezervareBuilder setMuzica(String muzica) {
        this.muzica = muzica;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.masaGeam, this.scaunCopil, this.flori, this.muzica);
    }
}
