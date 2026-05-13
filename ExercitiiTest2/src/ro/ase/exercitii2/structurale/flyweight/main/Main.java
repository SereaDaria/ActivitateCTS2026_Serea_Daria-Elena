package ro.ase.exercitii2.structurale.flyweight.main;

import ro.ase.exercitii2.structurale.flyweight.entity.Internare;
import ro.ase.exercitii2.structurale.flyweight.entity.RegistruPacienti;

public class Main {
    public static void main(String[] args) {
        RegistruPacienti registru = new RegistruPacienti();

        registru.getPacienti("Popa", "0798884332", "popa@gmail.com").
                afisareInternare(new Internare(10,2,5));
    }
}
