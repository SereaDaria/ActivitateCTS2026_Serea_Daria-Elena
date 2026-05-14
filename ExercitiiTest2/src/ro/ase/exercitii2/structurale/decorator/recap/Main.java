package ro.ase.exercitii2.structurale.decorator.recap;

public class Main {
    public static void main(String[] args) {
        INotaPlata notaPlata = new NotaPlata("Ana");
        notaPlata.printeazaNota(50);

        Decorator decorator = new DecoratorAnNou(notaPlata);
        decorator.printeazaFelicitare();
    }
}
