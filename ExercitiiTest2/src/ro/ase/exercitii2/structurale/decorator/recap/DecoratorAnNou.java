package ro.ase.exercitii2.structurale.decorator.recap;

public class DecoratorAnNou extends Decorator {
    public DecoratorAnNou(INotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
