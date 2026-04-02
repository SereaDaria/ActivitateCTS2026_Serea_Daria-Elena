package ro.ase.exercitii.Test3.FactoryMethod.Factory;


import ro.ase.exercitii.Test3.FactoryMethod.Entity.Meniu;
import ro.ase.exercitii.Test3.FactoryMethod.Entity.MeniuVegan;

public class MeniuVeganFactory implements MeniuFactory {
    @Override
    public Meniu createMeniu() {
        return new MeniuVegan();
    }
}
