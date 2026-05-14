package ro.ase.exercitii2.structurale.decorator.recap;

public class NotaPlata implements INotaPlata{
    private String numeClient;

    public NotaPlata(String numeClient) {
        this.numeClient = numeClient;
    }


    @Override
    public void printeazaNota(double suma) {
        System.out.println("Clientul " + this.numeClient + " a achitat suma de " + suma);
    }
}
