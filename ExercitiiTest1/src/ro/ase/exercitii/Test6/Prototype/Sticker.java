package ro.ase.exercitii.Test6.Prototype;

import ro.ase.exercitii.Test5.SimpleFactory.Entity.AMasina;

public class Sticker implements ISticker {
    private Masina masina;

    public Sticker(Masina masina) {
        this.masina = masina;
    }


    @Override
    public Sticker copiaza() {
        Sticker sticker = new Sticker(masina);
        return sticker;
    }


    public void afiseazaSticker() {
        System.out.println("Sticker{ masina = " + masina.toString() + "}");
    }
}
