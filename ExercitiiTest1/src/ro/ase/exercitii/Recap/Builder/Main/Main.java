package ro.ase.exercitii.Recap.Builder.Main;

import ro.ase.exercitii.Recap.Builder.Entity.Rezervare;
import ro.ase.exercitii.Recap.Builder.Entity.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setLocGeam(true).build("Ana-Maria");
        Rezervare rezervare2 = builder.setLocGeam(false).setAranjamentFloral(true).build("Alex");
        System.out.println(rezervare);
        System.out.println(rezervare2);
    }
}
