package ro.ase.exercitii2.comportamentale.command.entity;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void OcupaMasa(){
        System.out.println("Masa " + nrMasa + " a fost ocupata");
    }
}
