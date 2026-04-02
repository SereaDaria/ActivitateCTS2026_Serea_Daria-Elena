package ro.ase.exercitii.Builder.Main;

import ro.ase.exercitii.Builder.Entity.Rezervare;
import ro.ase.exercitii.Builder.Entity.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.build("Ana");
        Rezervare rezervare2 = builder.setMasaGeam(true).setDescoratiuniFlorale(true).build("Marian");
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
