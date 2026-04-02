package ro.ase.exercitii.Test2.Fabrici;

import ro.ase.exercitii.Test2.Entity.Vehicul;

public interface VehiculFabrica {
    Vehicul createVehicul(int id, String culoare);
    Vehicul createVehicul(int id, String culoare, int procentajBaterie);
}
