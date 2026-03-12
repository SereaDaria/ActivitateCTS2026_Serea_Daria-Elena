package ro.ase.seminar4.SimpleFactory.clase.factory;

import ro.ase.seminar4.simplefactory.clase.transport.*;

public class Factory {
    public MijlocTransport getMijlocTransport(TipTransport tip, String marca, Integer nrLinie) {
        switch (tip){
            case TipTransport.AUTOBUZ ->{
                return new Autobuz(nrLinie, marca);
            }
            case TipTransport.TRAMVAI -> {
                return new Tramvai(nrLinie, marca);
            }
            case TipTransport.TROLEIBUZ -> {
                return new Troleibuz(nrLinie, marca);
            }
            default -> {
                return null;
            }
        }
    }
}
