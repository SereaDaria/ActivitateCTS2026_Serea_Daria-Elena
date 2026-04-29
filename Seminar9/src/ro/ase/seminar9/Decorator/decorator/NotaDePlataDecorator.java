package ro.ase.seminar9.Decorator.decorator;

import ro.ase.seminar9.Decorator.Entity.INotaDePlata;

public abstract class NotaDePlataDecorator implements INotaDePlata {
    private INotaDePlata notaDePlata;

    public NotaDePlataDecorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza(){
        notaDePlata.printeaza();
    }

    public abstract void printeazaFelicitare();
}
