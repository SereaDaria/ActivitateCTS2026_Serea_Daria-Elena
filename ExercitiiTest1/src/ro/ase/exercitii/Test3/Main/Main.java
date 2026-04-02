package ro.ase.exercitii.Test3.Main;

import ro.ase.exercitii.Test3.Builder.Rezervare;
import ro.ase.exercitii.Test3.Builder.RezervareBuilder;
import ro.ase.exercitii.Test3.FactoryMethod.Entity.Meniu;
import ro.ase.exercitii.Test3.FactoryMethod.Factory.MeniuCuCarneFactory;
import ro.ase.exercitii.Test3.FactoryMethod.Factory.MeniuFactory;
import ro.ase.exercitii.Test3.FactoryMethod.Factory.MeniuVeganFactory;
import ro.ase.exercitii.Test3.FactoryMethod.Factory.MeniuVegetarianFactory;

public class Main {
    public static void main(String[] args) {
        MeniuFactory fabricaMeniuCarne = new MeniuCuCarneFactory();
        MeniuFactory fabricaMeniuVegetarian = new MeniuVegetarianFactory();
        MeniuFactory fabricaMeniuVegan = new MeniuVeganFactory();

        Meniu carne = fabricaMeniuCarne.createMeniu();
        Meniu vegetarian = fabricaMeniuVegetarian.createMeniu();
        Meniu vegan = fabricaMeniuVegan.createMeniu();

        carne.afiseazaMeniu();
        vegetarian.afiseazaMeniu();
        vegan.afiseazaMeniu();

        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setMasaGeam(true).setFlori(true).build("Daria");
        System.out.println(rezervare1);
    }
}
