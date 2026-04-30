package ro.ase.seminar10.Flyweight.Entity;

public class Client implements IClient {
    private String nume;
    private String nrTelefon;
    private String mail;

    protected Client(String nume, String nrTelefon, String mail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
    }


    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
        System.out.println("    " + rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println("Clientul " + nume + " plateste suma de " +rezervare.getNrPersoane()*taxaPerPersoana);
    }
}
