package ro.ase.exercitii2.structurale.decorator.recap;


public  abstract class Decorator implements INotaPlata {
    private INotaPlata notaPlata;

    public Decorator(INotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeazaNota(double suma) {
        notaPlata.printeazaNota(suma);
    }

    public abstract void printeazaFelicitare();
}
