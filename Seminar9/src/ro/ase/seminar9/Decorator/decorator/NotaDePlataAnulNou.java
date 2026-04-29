package ro.ase.seminar9.Decorator.decorator;

import ro.ase.seminar9.Decorator.Entity.INotaDePlata;

import java.sql.SQLOutput;

public class NotaDePlataAnulNou extends NotaDePlataDecorator{
    public NotaDePlataAnulNou(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
