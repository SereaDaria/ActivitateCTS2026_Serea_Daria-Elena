package ro.ase.exercitii.FactoryAbstract.Entity;

public class SupaDeLegume extends Supa {

    public SupaDeLegume(String nume, float pret){
        super(nume, pret);
    }

    @Override
    public void afiseazaFelDeMancare() {
        final StringBuilder sb = new StringBuilder("SupaDeLegume{");
        sb.append("nume=").append(this.nume);
        sb.append("pret=").append(this.pret);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
