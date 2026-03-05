package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Zookeper-ul "+name+", a hranit animalul "+animal.toString());
        animal.eat("mancare");
    }
}
