package ro.ase.seminar8.Facade.Entity;

public class Pacient {
    private String nume;
    private int gravitate;

    public String getNume() {
        return nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gravitate=").append(gravitate);
        sb.append('}');
        return sb.toString();
    }
}
