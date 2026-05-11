package ro.ase.seminar12.ChainOfResponsability.Main;

import ro.ase.seminar12.ChainOfResponsability.Entity.*;

public class Main {
    public static void main(String[] args) {
        Succesor autobuz = new CalatorieAutobuz();
        Succesor tramvai = new CalatoriTramvai();
        Succesor troleibuz = new CalatorieTroleibuz();
        Succesor metrou = new CalatorieMetrou();

        troleibuz.setCalatoriHandler(autobuz);
        autobuz.setCalatoriHandler(tramvai);
        tramvai.setCalatoriHandler(metrou);

        System.out.println(troleibuz.recomandaCalatorie(5));
        System.out.println(troleibuz.recomandaCalatorie(10));
        System.out.println(troleibuz.recomandaCalatorie(3));
        System.out.println(troleibuz.recomandaCalatorie(20));
    }
}
