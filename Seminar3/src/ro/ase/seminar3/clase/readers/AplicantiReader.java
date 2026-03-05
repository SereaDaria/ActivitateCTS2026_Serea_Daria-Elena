package ro.ase.seminar3.clase.readers;

import ro.ase.seminar3.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantiReader {

    protected String numeFisier;

    public AplicantiReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

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
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setNrProiecte(nr, vect);

    }
}

