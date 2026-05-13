package ro.ase.exercitii2.comportamentale.strategy.entity;

public class CardCalatorie implements ModPlata{
    @Override
    public void platesteCalatorie(String nume) {
        System.out.println("Calatorul " + nume + " a platit utilizand cardul de calatorie");
    }
}
