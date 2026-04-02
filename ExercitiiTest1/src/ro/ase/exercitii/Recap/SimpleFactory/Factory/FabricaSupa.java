package ro.ase.exercitii.Recap.SimpleFactory.Factory;

import ro.ase.exercitii.Recap.SimpleFactory.Entity.Supa;
import ro.ase.exercitii.Recap.SimpleFactory.Entity.SupaCrema;
import ro.ase.exercitii.Recap.SimpleFactory.Entity.SupaRosii;

public class FabricaSupa {
    public Supa createSupa(TipSupa tip, String nume, int pret){
        return switch(tip){
            case CREMA -> new SupaCrema(nume, pret);
            case ROSII -> new SupaRosii(nume, pret);
            default -> null;
        };
    }
}
