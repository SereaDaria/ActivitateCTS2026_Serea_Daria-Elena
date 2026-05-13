package ro.ase.exercitii2.comportamentale.observer.entity.observabil;

import ro.ase.exercitii2.comportamentale.observer.entity.observer.ICalator;

public interface IAutobuz {
    void aboneazaCalator(ICalator calator);
    void dezaboneazaCalator(ICalator calator);
    void trimiteNotificare(String notificare);
}
