package ro.ase.exercitii.Test2.Entity;

public class Trotineta implements Vehicul {
    private int id;
    private String culoare;
    private int procentajBaterie;

    public Trotineta(int id, String culoare, int procentajBaterie) {
        this.id = id;
        this.culoare = culoare;
        this.procentajBaterie = procentajBaterie;
    }

    @Override
    public void afiseazaVehicul() {
        final StringBuilder sb = new StringBuilder("Trotineta{");
        sb.append("id=").append(id);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", procentajBaterie=").append(procentajBaterie);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
