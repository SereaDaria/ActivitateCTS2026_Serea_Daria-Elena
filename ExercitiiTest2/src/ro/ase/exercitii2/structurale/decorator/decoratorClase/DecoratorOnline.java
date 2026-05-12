package ro.ase.exercitii2.structurale.decorator.decoratorClase;

import ro.ase.exercitii2.structurale.decorator.entity.IFisaAnalize;

public class DecoratorOnline extends Decorator {

    public DecoratorOnline(IFisaAnalize fisaAnalize) {
        super(fisaAnalize);
    }

    @Override
    public void printeazaRezultate() {
        super.fisaAnalize.printeazaRezultate();
        System.out.println("Rezultate transmise si in online!");
    }
}
