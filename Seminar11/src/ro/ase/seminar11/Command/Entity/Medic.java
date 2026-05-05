package ro.ase.seminar11.Command.Entity;

public class Medic implements IPersonalSpital {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul " + this.nume + " interneaza pacientul " + pacient.getNume());
    }
}
