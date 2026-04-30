package ro.ase.seminar10.Flyweight.Entity;

public interface IClient {
    void afiseazaRezervare(Rezervare rezervare);
    void plateste(Rezervare rezervare, double taxaPerPersoana);

}
