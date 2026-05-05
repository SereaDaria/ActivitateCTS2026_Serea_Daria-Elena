package ro.ase.seminar11.Command.Main;

import ro.ase.seminar11.Command.Entity.Asistenta;
import ro.ase.seminar11.Command.Entity.IPersonalSpital;
import ro.ase.seminar11.Command.Entity.Medic;
import ro.ase.seminar11.Command.Entity.Pacient;
import ro.ase.seminar11.Command.command.ICommand;
import ro.ase.seminar11.Command.command.Internare;
import ro.ase.seminar11.Command.command.Operator;
import ro.ase.seminar11.Command.command.Tratare;
import ro.ase.seminar11.Observer.Entity.IPacient;
import ro.ase.seminar11.Observer.Entity.Spital;

public class Main {
    public static void main(String[] args) {
        IPersonalSpital medic = new Medic("Popescu");
        IPersonalSpital asistenta = new Asistenta("Mihaela");
        Pacient pacient1 = new Pacient("Ana");
        Pacient pacient2 = new Pacient("Maria");

        ICommand comanda1 = new Internare(medic, pacient1);
        ICommand comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.invoca(comanda1);
        operator.invoca(comanda2);
        operator.executaComanda();
        operator.invoca(new Tratare(asistenta, pacient2));
        operator.executaComanda();
    }
}
