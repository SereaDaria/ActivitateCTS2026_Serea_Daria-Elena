package ro.ase.exercitii.Builder.Entity;

public class RezervareBuilder implements IRezervareBuilder {
    private boolean masaGeam;
    private boolean scaunCopil;
    private boolean descoratiuniFlorale;

    public RezervareBuilder() {
        this.masaGeam = false;
        this.scaunCopil = false;
        this.descoratiuniFlorale = false;
    }

    public RezervareBuilder setMasaGeam(boolean masaGeam) {
        this.masaGeam = masaGeam;
        return this;
    }

    public RezervareBuilder setScaunCopil(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
        return this;
    }

    public RezervareBuilder setDescoratiuniFlorale(boolean descoratiuniFlorale) {
        this.descoratiuniFlorale = descoratiuniFlorale;
        return this;
    }

    @Override
    public Rezervare build(String nume) {
        return new Rezervare(nume, this.masaGeam, this.scaunCopil, this.descoratiuniFlorale);
    }
}
