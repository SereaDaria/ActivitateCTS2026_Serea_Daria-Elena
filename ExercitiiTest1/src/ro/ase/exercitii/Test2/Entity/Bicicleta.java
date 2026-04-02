package ro.ase.exercitii.Test2.Entity;

public class Bicicleta implements Vehicul {
    private int id;
    private String culoare;

    public Bicicleta( int id, String culoare) {
        this.id = id;
        this.culoare = culoare;
    }

    @Override
    public void afiseazaVehicul() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("id=").append(id);
        sb.append(", 'culoare='").append(culoare);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
