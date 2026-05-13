package ro.ase.exercitii2.structurale.proxy.entity;

public class ProxyRezervare implements IRezervare {
    Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public Rezervare getRezervare() {
        return rezervare;
    }

    public void setRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare() {
        if(this.rezervare.getNrPersoane() >= 4) {
            rezervare.realizeazaRezervare();
        }
        else {
            System.out.println("Rezervare poate fi facuta pentru minim 4 persoane!");
        }
    }
}
