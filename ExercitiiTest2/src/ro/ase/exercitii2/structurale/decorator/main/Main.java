package ro.ase.exercitii2.structurale.decorator.main;

import ro.ase.exercitii2.structurale.decorator.decoratorClase.Decorator;
import ro.ase.exercitii2.structurale.decorator.decoratorClase.DecoratorOnline;
import ro.ase.exercitii2.structurale.decorator.entity.FisaAnalize;
import ro.ase.exercitii2.structurale.decorator.entity.IFisaAnalize;

public class Main {
    public static void main(String[] args) {
        IFisaAnalize fisaAnalize = new FisaAnalize("Popescu");
        IFisaAnalize fisaAnalize2 = new FisaAnalize("Ana");

        fisaAnalize.printeazaRezultate();
        fisaAnalize2.printeazaRezultate();

        Decorator decoratorOnline = new DecoratorOnline(fisaAnalize);
        decoratorOnline.printeazaRezultate();
    }
}
