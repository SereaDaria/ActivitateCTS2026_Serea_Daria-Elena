package ro.ase.exercitii.SimpleFactory.Factory;

import ro.ase.exercitii.SimpleFactory.Entity.Supa;
import ro.ase.exercitii.SimpleFactory.Entity.SupaDeCiuperci;
import ro.ase.exercitii.SimpleFactory.Entity.SupaDeLegume;
import ro.ase.exercitii.SimpleFactory.Entity.SupaDeVita;

public class SupaFactory {
    public Supa creareSupa(TipSupa tipSupa, float pret) throws Exception {
        switch(tipSupa){
            case LEGUME:
                return new SupaDeLegume(pret);
            case CIUPERCI:
                return new SupaDeCiuperci(pret);
            case VITA:
                return new SupaDeVita(pret);
            default:
                throw new Exception("Tipul de supa introdus nu este valid!");
        }
    }
}
