package ro.ase.exercitii2.structurale.decorator.decoratorClase;

import ro.ase.exercitii2.structurale.decorator.entity.IFisaAnalize;

public abstract class Decorator implements IFisaAnalize{
    protected IFisaAnalize fisaAnalize;

    public Decorator(IFisaAnalize fisaAnalize) {
        this.fisaAnalize = fisaAnalize;
    }

    @Override
    public abstract void printeazaRezultate();

}
