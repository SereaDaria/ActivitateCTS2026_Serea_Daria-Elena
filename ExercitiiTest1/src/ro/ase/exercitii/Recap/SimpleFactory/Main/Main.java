package ro.ase.exercitii.Recap.SimpleFactory.Main;

import ro.ase.exercitii.Recap.SimpleFactory.Entity.Supa;
import ro.ase.exercitii.Recap.SimpleFactory.Factory.FabricaSupa;
import ro.ase.exercitii.Recap.SimpleFactory.Factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabrica = new FabricaSupa();
        Supa supaCrema = fabrica.createSupa(TipSupa.CREMA, "de morcovi", 20);
        Supa supaRosii = fabrica.createSupa(TipSupa.ROSII, "cu carne", 25);
        supaCrema.afisareSupa();
        supaRosii.afisareSupa();
    }
}
