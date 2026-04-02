package ro.ase.exercitii.Recap.Builder.Entity;

public class RezervareBuilder implements IRezervareBuilder {
    private boolean locGeam;
    private boolean aranjamentFloral;

    public RezervareBuilder() {
        this.locGeam = false;
        this.aranjamentFloral = false;
    }

    public RezervareBuilder setLocGeam(boolean locGeam) {
        this.locGeam = locGeam;
        return this;
    }

    public RezervareBuilder setAranjamentFloral(boolean aranjamentFloral) {
        this.aranjamentFloral = aranjamentFloral;
        return this;
    }

    @Override
    public Rezervare build(String nume) {
        return new Rezervare(nume, this.locGeam, this.aranjamentFloral);
    }
}
