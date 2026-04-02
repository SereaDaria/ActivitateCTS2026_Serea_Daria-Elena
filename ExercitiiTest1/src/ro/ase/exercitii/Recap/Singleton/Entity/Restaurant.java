package ro.ase.exercitii.Recap.Singleton.Entity;

public class Restaurant {
    private String nume;
    private int id;

    private static Restaurant instantaRestaurant = null;

    private Restaurant(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }

    public static synchronized Restaurant getInstanta(String nume, int id){
        if(instantaRestaurant == null){
            instantaRestaurant = new Restaurant(nume, id);
        }
        return instantaRestaurant;
    }
}
