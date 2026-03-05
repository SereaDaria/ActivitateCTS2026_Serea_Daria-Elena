package ro.ase.seminar3.main;

import ro.ase.seminar3.clase.Angajat;
import ro.ase.seminar3.clase.Aplicant;
import ro.ase.seminar3.clase.readers.AngajatiReader;
import ro.ase.seminar3.clase.readers.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try {
            AplicantiReader reader = new AngajatiReader("angajati.txt");
            listaAngajati = reader.readAplicanti();
            for (Aplicant aplicant : listaAngajati) {
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afisareStatut();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}