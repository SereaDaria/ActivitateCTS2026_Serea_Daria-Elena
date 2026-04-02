package ro.ase.exercitii.Test6.SimpleFactory.Factory;

import com.sun.source.tree.NewArrayTree;
import ro.ase.exercitii.Test6.SimpleFactory.Entity.*;

public class ComponentaFactory {
    public IComponenta creazaComponnenta(TipComponenta tip, float dimensiune) {
        return switch(tip){
            case BARA -> new Bara(dimensiune);
            case CAPOTA -> new Capota(dimensiune);
            case PORTBAGAJ -> new Portbagaj(dimensiune);
            case USA -> new Usa(dimensiune);
            default -> null;
        };
    }
}
