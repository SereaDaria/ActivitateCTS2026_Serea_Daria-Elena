package ro.ase.seminar9.Decorator.decorator;

import ro.ase.seminar9.Decorator.Entity.INotaDePlata;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 Mai!");
    }
}
