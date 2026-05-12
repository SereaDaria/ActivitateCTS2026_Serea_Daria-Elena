package ro.ase.exercitii2.structurale.decorator.entity;

public class FisaAnalize implements IFisaAnalize{
    String numePacient;

    public FisaAnalize(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void printeazaRezultate() {
        System.out.println("Rezultatele pacientului " + numePacient + " au fost printate!");
    }
}
