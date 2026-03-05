package ro.ase.seminar3.clase.readers;

import ro.ase.seminar3.clase.Aplicant;
import ro.ase.seminar3.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantiReader {

    public EleviReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev e = new Elev();
            super.readAplicant(input, e);

            int clasa = input.nextInt();
            e.setClasa(clasa);

            String tutore = input.next();
            e.setTutore(tutore);

            elevi.add(e);
        }

        input.close();
        return elevi;
    }
}