package ro.ase.seminar8.Proxy.Main;

import ro.ase.seminar8.Proxy.Entity.Pacient;
import ro.ase.seminar8.Proxy.Entity.Spital;
import ro.ase.seminar8.Proxy.proxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("David", true);
        Pacient pacient2 = new Pacient("Davide", false);
        Spital spital = new Spital("Judetean");

        spital.interneazaPacient(pacient);
        ProxyCuAsigurare proxy = new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);
        proxy.interneazaPacient(pacient2);
    }
}
