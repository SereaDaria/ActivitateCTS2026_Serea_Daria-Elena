package ro.ase.exercitii.FactoryAbstract.Entity;

public class Clatite extends Desert {

    public Clatite(String nume, float pret, int cantitate) {
        super(nume, pret, cantitate);
    }


    @Override
    public void afiseazaFelDeMancare() {
        final StringBuilder sb = new StringBuilder("Clatite{");
        sb.append("nume='").append(this.nume).append('\'');
        sb.append(", pret=").append(this.pret);
        sb.append(", cantitate=").append(this.cantitate);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
