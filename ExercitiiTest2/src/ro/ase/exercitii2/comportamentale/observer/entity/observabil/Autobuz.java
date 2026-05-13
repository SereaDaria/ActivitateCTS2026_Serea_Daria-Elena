package ro.ase.exercitii2.comportamentale.observer.entity.observabil;

import ro.ase.exercitii2.comportamentale.observer.entity.observer.ICalator;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private String nrAutobuz;
    private List<ICalator> calatori;

    public Autobuz(String nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.calatori = new ArrayList<>();
    }


    @Override
    public void aboneazaCalator(ICalator calator) {
        calatori.add(calator);
    }

    @Override
    public void dezaboneazaCalator(ICalator calator) {
        calatori.remove(calator);
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for(ICalator calator : calatori) {
            calator.primesteNotificare("Autobuzul " + this.nrAutobuz + ": " + notificare);
        }
    }

    public void trimiteNotificareCapatDeLinie(){
        trimiteNotificare("Autobuzul a plecat din capat de linie!");
    }
}
