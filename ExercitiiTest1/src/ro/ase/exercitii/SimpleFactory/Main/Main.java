package ro.ase.exercitii.SimpleFactory.Main;

import ro.ase.exercitii.SimpleFactory.Entity.Supa;
import ro.ase.exercitii.SimpleFactory.Factory.SupaFactory;
import ro.ase.exercitii.SimpleFactory.Factory.TipSupa;


//B.1. Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită,
//etc. Să se implementeze modulul care permite realizarea de obiecte din familia supelor. Tipurile
//de supă sunt reținute în cadrul unui enum.


public class Main {
    public static void main(String[] args) throws Exception {
        SupaFactory supaFactory = new SupaFactory();

        Supa supa1 = supaFactory.creareSupa(TipSupa.LEGUME, 3);
        Supa supa2 = supaFactory.creareSupa(TipSupa.VITA, 9);

        supa1.afiseazaSupa();
        supa2.afiseazaSupa();
    }
}
