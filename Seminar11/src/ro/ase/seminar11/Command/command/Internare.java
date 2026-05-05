package ro.ase.seminar11.Command.command;

import ro.ase.seminar11.Command.Entity.IPersonalSpital;
import ro.ase.seminar11.Command.Entity.Pacient;

public class Internare implements ICommand{
    private IPersonalSpital medic;
    private Pacient pacient;

    public Internare(IPersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
