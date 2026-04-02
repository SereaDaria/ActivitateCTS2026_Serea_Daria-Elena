package ro.ase.exercitii.Test2.Fabrici;

import ro.ase.exercitii.Test2.Entity.Trotineta;
import ro.ase.exercitii.Test2.Entity.Vehicul;

public class TrotinetaFabrica implements VehiculFabrica{

    @Override
    public Vehicul createVehicul(int id, String culoare) {
        return this.createVehicul(id,culoare, 100);
    }

    @Override
    public Vehicul createVehicul(int id, String culoare, int procentajBaterie) {
        return new Trotineta(id,culoare,procentajBaterie);
    }
}
