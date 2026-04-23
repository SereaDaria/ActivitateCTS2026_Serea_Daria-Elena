package ro.ase.seminar8.Facade.Entity;

public class Medic {
    private String nume;

    public boolean areBiletDeTrimitere(Pacient pacient){
        return pacient.getGravitate()>=6;
    }

    public Medic(String nume) {
        this.nume = nume;
    }
}
