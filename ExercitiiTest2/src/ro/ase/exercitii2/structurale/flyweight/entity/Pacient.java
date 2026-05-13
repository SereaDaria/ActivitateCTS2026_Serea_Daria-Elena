package ro.ase.exercitii2.structurale.flyweight.entity;

public class Pacient implements IPacient {
    private String nume;
    private String nrTelefon;
    private String email;

    public Pacient(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void afisarePacient() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }

    @Override
    public void afisareInternare(Internare internare) {
        System.out.println("Pacientul " + this.nume + " a fost internat in salonul " + internare.getNrSalon() +
                " in patul " + internare.getNrPat() + " pentru " + internare.getNrZile() + " zile!");
    }
}
