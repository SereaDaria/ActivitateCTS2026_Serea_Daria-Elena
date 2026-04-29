package ro.ase.seminar9.Composite.Main;

import ro.ase.seminar9.Composite.Entity.Departament;
import ro.ase.seminar9.Composite.Entity.Sectie;
import ro.ase.seminar9.Composite.Entity.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdmin = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secreatariat", 20);
        Structura sectieManagement = new Sectie("Management", 22);

        ((Departament) depSpital).adaugaStructura(depAdmin);
        ((Departament) depSpital).adaugaStructura(sectieSecretariat);
        ((Departament) depSpital).adaugaStructura(sectieManagement);

        depSpital.afiseazaDetalii();

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdmin).adaugaStructura(sectieManagement);

        depSpital.afiseazaDetalii();
    }
}
