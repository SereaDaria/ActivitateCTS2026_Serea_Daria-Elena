package ro.ase.seminar10.Strategy.Entity;

public class PlataCash implements ModalitatePlata {
    @Override
    public void plateste(String nume, Double suma) {
        System.out.println(nume + " plateste cash " + suma);
    }
}
