package ro.ase.seminar11.Observer.Main;

import ro.ase.seminar11.Observer.Entity.IPacient;
import ro.ase.seminar11.Observer.Entity.ISpital;
import ro.ase.seminar11.Observer.Entity.Pacient;
import ro.ase.seminar11.Observer.Entity.Spital;

public class Main {
    public static void main(String[] args) {
        IPacient pacient1 = new Pacient("Maria", 23);
        IPacient pacient2 = new Pacient("Ana", 30);
        IPacient pacient3 = new Pacient("Mihai", 25);

        ISpital spital = new Spital("Judetean");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaEpidemie();
        System.out.println("------------------");
        ((Spital)spital).notificaVirus();
    }
}
