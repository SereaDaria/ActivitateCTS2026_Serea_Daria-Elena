package ro.ase.exercitii.Test2.Builder;

public class RezervareBuilder implements IRezervareBuilder {
    private boolean cascaProtectie;
    private boolean cosCumparaturi;
    private boolean asigurareAccidente;
    private int nrKmInclusi;

    public RezervareBuilder() {
        this.cascaProtectie = false;
        this.cosCumparaturi = false;
        this.asigurareAccidente = false;
        this.nrKmInclusi = 0;
    }

    public RezervareBuilder setCascaProtectie(boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
        return this;
    }

    public RezervareBuilder setCosCumparaturi(boolean cosCumparaturi) {
        this.cosCumparaturi = cosCumparaturi;
        return this;
    }

    public RezervareBuilder setAsigurareAccidente(boolean asigurareAccidente) {
        this.asigurareAccidente = asigurareAccidente;
        return this;
    }

    public RezervareBuilder setNrKmInclusi(int nrKmInclusi) {
        this.nrKmInclusi = nrKmInclusi;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.cascaProtectie,this.cosCumparaturi, this.asigurareAccidente,this.nrKmInclusi);
    }
}
