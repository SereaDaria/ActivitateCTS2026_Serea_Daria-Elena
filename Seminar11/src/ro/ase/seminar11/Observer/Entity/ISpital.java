package ro.ase.seminar11.Observer.Entity;

public interface ISpital {
    void trimiteMesaj(String mesaj);
    void aboneazaPacient(IPacient pacient);
    void dezaPacient(IPacient pacient);
}
