package ro.ase.exercitii.Builder.Main;

import ro.ase.exercitii.Builder.Entity.Rezervare;
import ro.ase.exercitii.Builder.Entity.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.build("Ana");
        Rezervare rezervare2 = builder.setMasaGeam(true).build("Marian");
        Rezervare rezervare3 = builder.setDescoratiuniFlorale(true).build("Alex");
        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}
