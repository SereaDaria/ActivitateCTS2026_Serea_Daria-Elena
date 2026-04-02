package ro.ase.exercitii.Test2.Main;

import ro.ase.exercitii.Test2.Builder.Rezervare;
import ro.ase.exercitii.Test2.Builder.RezervareBuilder;
import ro.ase.exercitii.Test2.Entity.Vehicul;
import ro.ase.exercitii.Test2.Fabrici.BicicletaFabrica;
import ro.ase.exercitii.Test2.Fabrici.TrotinetaFabrica;
import ro.ase.exercitii.Test2.Fabrici.VehiculFabrica;

public class Main {
    public static void main(String[] args) {
       VehiculFabrica fabricaBicicleta = new BicicletaFabrica();
       VehiculFabrica fabricaTrotineta = new TrotinetaFabrica();

       Vehicul bicileta1 = fabricaBicicleta.createVehicul(1,"rosu");
       Vehicul trotineta1 = fabricaTrotineta.createVehicul(2,"mov", 50);

        bicileta1.afiseazaVehicul();
        trotineta1.afiseazaVehicul();

        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setCosCumparaturi(true).build("Maria");
        Rezervare rezervare2 = builder.setNrKmInclusi(20).build("Ana");
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
