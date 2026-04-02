package ro.ase.exercitii.Test5.SimpleFactory.Factory;

import ro.ase.exercitii.Test5.SimpleFactory.Entity.AMasina;
import ro.ase.exercitii.Test5.SimpleFactory.Entity.SUV;
import ro.ase.exercitii.Test5.SimpleFactory.Entity.Sedan;
import ro.ase.exercitii.Test5.SimpleFactory.Entity.VAN;

public class MasinaFactory {
    public AMasina getMasina(TipMasina tip, String nrInmatriculare, String model) {
        return switch(tip){
            case SEDAN -> new Sedan(nrInmatriculare, model);
            case SUV -> new SUV(nrInmatriculare, model);
            case VAN -> new VAN(nrInmatriculare, model);
            default -> null;
        };
    }

}
