package ro.ase.exercitii2.comportamentale.command.entity;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> rezervari;

    public Operator() {
        this.rezervari = new ArrayList<>();
    }

    public void inregistreazaRezervare(Command comandaRezervare) {
       rezervari.add(comandaRezervare);
    }

    public void executaRezervare() {
        if(rezervari.size() > 0)   {
            this.rezervari.get(0).executa();
            rezervari.remove(0);
        }
    }
}
