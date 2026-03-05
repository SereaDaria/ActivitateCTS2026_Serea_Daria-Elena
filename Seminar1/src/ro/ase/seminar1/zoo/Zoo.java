package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    ZooKeeper zooKeeper;
    List<Animal> animale;

    public Zoo(String nume, ZooKeeper zooKeeper) {
        this.nume = nume;
        this.zooKeeper = zooKeeper;
        this.animale = new ArrayList<>();
    }

    public void feedAnimals() {
        for(Animal animal : animale) {
            zooKeeper.feedAnimal(animal);
        }
    }

    public void addAnimal(Animal animal) {
        animale.add(animal);
    }
}
