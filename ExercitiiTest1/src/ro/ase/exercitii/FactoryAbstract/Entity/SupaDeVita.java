package ro.ase.exercitii.FactoryAbstract.Entity;

public class SupaDeVita extends Supa{

    public SupaDeVita(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afiseazaFelDeMancare() {
        final StringBuilder sb = new StringBuilder("SupaDeVita{");
        sb.append("nume='").append(this.nume).append('\'');
        sb.append(", pret=").append(this.pret);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
