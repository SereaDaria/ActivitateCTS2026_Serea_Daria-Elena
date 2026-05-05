package ro.ase.seminar11.Command.Entity;

public class Asistenta implements IPersonalSpital {
    String nume;

    public Asistenta(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta " + this.nume + " trateaza imediat pacientul " + pacient.getNume());
    }
}
