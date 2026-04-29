package ro.ase.seminar9.Decorator.Main;

import ro.ase.seminar9.Decorator.Entity.INotaDePlata;
import ro.ase.seminar9.Decorator.Entity.NotaDePlata;
import ro.ase.seminar9.Decorator.decorator.NotaDePlata1Mai;
import ro.ase.seminar9.Decorator.decorator.NotaDePlataAnulNou;
import ro.ase.seminar9.Decorator.decorator.NotaDePlataDecorator;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata = new NotaDePlata(87, "20.04.2026");
        notaDePlata.printeaza();

        NotaDePlataDecorator notaDecorator = new NotaDePlataAnulNou(notaDePlata);
        notaDecorator.printeaza();
        notaDecorator.printeazaFelicitare();

        int a = 2;
        NotaDePlataDecorator notaDePlataDecorator = null;

        if(a==1)
        {
            notaDePlataDecorator = new NotaDePlataAnulNou(notaDePlata);
        }
        else
        {
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
