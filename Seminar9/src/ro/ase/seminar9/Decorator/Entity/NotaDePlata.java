package ro.ase.seminar9.Decorator.Entity;

public class NotaDePlata implements INotaDePlata{
    private float suma;
    private String data;

    public NotaDePlata(float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    public float getSuma() {
        return suma;
    }

    public String getData() {
        return data;
    }

    @Override
    public void printeaza() {
        System.out.println("La data de " + data + " a fost achitata suma de " + suma);
    }
}
