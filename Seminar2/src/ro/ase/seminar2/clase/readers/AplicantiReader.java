package ro.ase.seminar2.clase.readers;

import ro.ase.seminar2.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantiReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public void readAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        aplicant.setNume(nume);

        String prenume = input.next();
        aplicant.setPrenume(prenume);

        int varsta = input.nextInt();
        aplicant.setVarsta(varsta);

        int punctaj = input.nextInt();
        aplicant.setPunctaj(punctaj);

        int nr = input.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setNr_proiecte(nr, vect);

    }
}