package ro.ase.exercitii2.comportamentale.strategy.entity;

public class SMS implements ModPlata{
    @Override
    public void platesteCalatorie(String nume) {
        System.out.println("Calatorul " + nume + " a platit prin SMS");
    }
}
