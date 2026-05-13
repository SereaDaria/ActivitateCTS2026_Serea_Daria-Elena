package ro.ase.exercitii2.comportamentale.command.entity;

public class ComandaRezervare implements Command{
    Masa masa;

    public ComandaRezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.OcupaMasa();
    }
}
