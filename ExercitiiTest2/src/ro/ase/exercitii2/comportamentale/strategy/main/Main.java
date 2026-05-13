package ro.ase.exercitii2.comportamentale.strategy.main;

import ro.ase.exercitii2.comportamentale.strategy.entity.Calator;
import ro.ase.exercitii2.comportamentale.strategy.entity.SMS;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new Calator("Popescu Ana");
        calator1.platesteCalatorie();

        calator1.setModPlata(new SMS());
        calator1.platesteCalatorie();
    }
}
