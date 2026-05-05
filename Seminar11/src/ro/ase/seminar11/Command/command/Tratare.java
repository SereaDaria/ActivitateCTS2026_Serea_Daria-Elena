package ro.ase.seminar11.Command.command;

import ro.ase.seminar11.Command.Entity.IPersonalSpital;
import ro.ase.seminar11.Command.Entity.Pacient;

public class Tratare implements ICommand{
    private IPersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(IPersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);
    }
}
