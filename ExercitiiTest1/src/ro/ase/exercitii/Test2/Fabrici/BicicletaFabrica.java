package ro.ase.exercitii.Test2.Fabrici;


import ro.ase.exercitii.Test2.Entity.Bicicleta;
import ro.ase.exercitii.Test2.Entity.Vehicul;

public class BicicletaFabrica implements VehiculFabrica {

    @Override
    public Vehicul createVehicul(int id, String culoare) {
        return new Bicicleta(id, culoare);
    }

    @Override
    public Vehicul createVehicul(int id, String culoare, int procentajBaterie) {
        return this.createVehicul(id, culoare);
    }
}
