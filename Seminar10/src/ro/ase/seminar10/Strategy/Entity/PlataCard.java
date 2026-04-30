package ro.ase.seminar10.Strategy.Entity;

public class PlataCard implements ModalitatePlata {

    @Override
    public void plateste(String nume, Double suma) {
        System.out.println(nume + " plateste card " + suma);
    }
}
