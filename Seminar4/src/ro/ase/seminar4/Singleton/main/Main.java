package ro.ase.seminar4.Singleton.main;

import ro.ase.singleton01.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger instance = Logger.getInstanta("Interfata", "Afisare");
        instance.afiseazaLog("fisierul json nu este afisat corect");
        instance.afiseazaLog("Eroare");
        Logger instance2 = Logger.getInstanta("Backend", "baza de date");
        instance2.afiseazaLog("eroare");
        instance2.afiseazaLog("Backend");
        instance2.afiseazaLog("baza de date");
        instance2.afiseazaLog("Eroare la inserare");

    }
}
