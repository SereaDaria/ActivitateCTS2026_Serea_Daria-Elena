package ro.ase.seminar1.main;

import ro.ase.seminar1.animale.Lion;
import ro.ase.seminar1.animale.Tigru;
import ro.ase.seminar1.animale.Zebra;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Luca");
        Lion lion1 = new Lion("Simba", 4, 160);
        Zebra zebra1 = new Zebra("Marty", 6, 30);
        Tigru tigru1 = new Tigru("Tiger", 10, "Bengalez");

        Zoo zoo = new Zoo("Gradina zoo", zooKeeper);
        zoo.addAnimal(lion1);
        zoo.addAnimal(zebra1);
        zoo.addAnimal(tigru1);

        zoo.feedAnimals();
    }
}
