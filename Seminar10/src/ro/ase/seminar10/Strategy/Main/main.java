package ro.ase.seminar10.Strategy.Main;

import ro.ase.seminar10.Strategy.Entity.Client;
import ro.ase.seminar10.Strategy.Entity.ModalitatePlata;
import ro.ase.seminar10.Strategy.Entity.PlataCash;

public class main {
    public static void main(String[] args) {
        Client client = new Client("Ana");
        client.platesteTranzactie(28);
        Client client2 = new Client("Maria");
        client2.setModalitatePlata(new PlataCash());
        client2.platesteTranzactie(100);
    }
}
