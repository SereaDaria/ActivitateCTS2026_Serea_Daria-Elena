package ro.ase.exercitii.Recap.Singleton.Main;

import ro.ase.exercitii.Recap.Singleton.Entity.Restaurant;

public class Main {
    public static void main(String[] args) {
//        Restaurant restaurant = new Restaurant();
        Restaurant restaurant = Restaurant.getInstanta("Main", 011);
        Restaurant restaurant2 = Restaurant.getInstanta("MainSecundar", 022);
        System.out.println(restaurant.getNume());
        System.out.println(restaurant2.getNume());
    }
}
