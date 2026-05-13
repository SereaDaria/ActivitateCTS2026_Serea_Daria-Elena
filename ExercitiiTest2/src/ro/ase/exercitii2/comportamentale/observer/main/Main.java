package ro.ase.exercitii2.comportamentale.observer.main;

import ro.ase.exercitii2.comportamentale.observer.entity.observabil.Autobuz;
import ro.ase.exercitii2.comportamentale.observer.entity.observabil.IAutobuz;
import ro.ase.exercitii2.comportamentale.observer.entity.observer.Calator;
import ro.ase.exercitii2.comportamentale.observer.entity.observer.ICalator;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz1 = new Autobuz("478");

        ICalator calator1 = new Calator("Ana");
        ICalator calator2 = new Calator("Maria");
        ICalator calator3 = new Calator("Dan");

        autobuz1.aboneazaCalator(calator1);
        autobuz1.aboneazaCalator(calator2);
        autobuz1.aboneazaCalator(calator3);
        ((Autobuz) autobuz1).trimiteNotificareCapatDeLinie();
        System.out.println();
        autobuz1.dezaboneazaCalator(calator1);
        ((Autobuz) autobuz1).trimiteNotificareCapatDeLinie();
    }
}
