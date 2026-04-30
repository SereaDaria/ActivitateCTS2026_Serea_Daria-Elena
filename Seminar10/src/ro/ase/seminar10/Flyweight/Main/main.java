package ro.ase.seminar10.Flyweight.Main;

import ro.ase.seminar10.Flyweight.Entity.FabricaClienti;
import ro.ase.seminar10.Flyweight.Entity.IClient;
import ro.ase.seminar10.Flyweight.Entity.Rezervare;

public class main {
    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();
        IClient client1 = fabricaClienti.getClient("Ana", "0788945234", "ana@gmail.com");
        IClient client2 = fabricaClienti.getClient("Maria", "0788933434", "maria@gmail.com");
        IClient client3 = fabricaClienti.getClient("Vasile", "0781278234", "vasile23@gmail.com");

        Rezervare rezervare1 = new Rezervare(2, "12:00", 4);
        Rezervare rezervare2 = new Rezervare(4, "14:00", 6);
        Rezervare rezervare3 = new Rezervare(10, "10:00", 2);

        client1.afiseazaRezervare(rezervare1);
        client2.afiseazaRezervare(rezervare2);
        client3.afiseazaRezervare(rezervare3);

        fabricaClienti.getClient("Ana", "0788945234", "ana@gmail.com").afiseazaRezervare(rezervare1);
        fabricaClienti.getClient("Ana", "0788945234", "ana@gmail.com").plateste(rezervare1, 20);

        Rezervare rezervare4 = new Rezervare(5, "12:00", 7);
        fabricaClienti.getClient("Vasile", "0781278234", "vasile23@gmail.com").afiseazaRezervare(rezervare4);
        fabricaClienti.getClient("Vasile", "0781278234", "vasile23@gmail.com").plateste(rezervare4, 20);



    }
}
