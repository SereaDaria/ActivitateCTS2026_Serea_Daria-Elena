package ro.ase.seminar11.Observer.Entity;

public class Pacient implements IPacient {
    private String nume;
    private int varsta;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Pacientul " + this.nume + " a primit mesajul: " + mesaj);
    }
}
