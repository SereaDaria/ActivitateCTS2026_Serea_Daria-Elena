package ro.ase.seminar4.SimpleFactory.main;

import ro.ase.seminar4.simplefactory.clase.factory.Factory;
import ro.ase.seminar4.simplefactory.clase.factory.TipTransport;
import ro.ase.seminar4.simplefactory.clase.transport.Autobuz;
import ro.ase.seminar4.simplefactory.clase.transport.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        MijlocTransport autobuz = factory.getMijlocTransport(TipTransport.AUTOBUZ, "MAN", 2);
        autobuz.afiseazaTipTransport();
        MijlocTransport tramvai = factory.getMijlocTransport(TipTransport.TRAMVAI, "TRM", 12);
        tramvai.afiseazaTipTransport();
        MijlocTransport troleibuz = factory.getMijlocTransport(TipTransport.TROLEIBUZ, "TRZ", 123);
        troleibuz.afiseazaTipTransport();
    }
}
