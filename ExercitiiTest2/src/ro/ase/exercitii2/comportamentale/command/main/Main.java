package ro.ase.exercitii2.comportamentale.command.main;

import ro.ase.exercitii2.comportamentale.command.entity.ComandaRezervare;
import ro.ase.exercitii2.comportamentale.command.entity.Command;
import ro.ase.exercitii2.comportamentale.command.entity.Masa;
import ro.ase.exercitii2.comportamentale.command.entity.Operator;
import ro.ase.exercitii2.structurale.proxy.entity.Rezervare;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(10);
        Masa masa2 = new Masa(11);

        Command comandaRezervare1 = new ComandaRezervare(masa1);
        Command comandaRezervare2 = new ComandaRezervare(masa2);

        Operator operator = new Operator();
        operator.inregistreazaRezervare(comandaRezervare1);
        operator.inregistreazaRezervare(comandaRezervare2);
        operator.executaRezervare();
        operator.executaRezervare();
    }
}
