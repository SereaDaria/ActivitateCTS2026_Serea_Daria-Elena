package ro.ase.seminar11.Observer.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Spital implements ISpital{
    private String nume;
    private List<IPacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IPacient pacient: pacienti) {
            pacient.receptioneazaNotificare(mesaj + " de la spitalul " + this.nume);
        }
    }

    @Override
    public void aboneazaPacient(IPacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void dezaPacient(IPacient pacient) {
        pacienti.remove(pacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Atentie! Pericol de virus nou!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Atentie! Pericol de epidemie!");
    }

}
