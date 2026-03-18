package ro.ase.seminar5.Builder.Main;

import ro.ase.seminar5.Builder.BuilderEntity.Internare;
import ro.ase.seminar5.Builder.BuilderEntity.InternareBuilder;
import ro.ase.seminar5.Builder.BuilderEntity.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        //daca vrem sa nu poata fi setate valorile dupa setarea lor initiala
        //vom face seterii din internare protected sau private
        //daca e private, vom face builder in clasa internare ca inner class
        //constructorul devine si el privat si apelarea se va face doar prin builder
        //aceasta varianta descrisa este cea mai folosita
        Internare internare1 = new Internare(true, true, false, true, "Ana Popa");
        Internare internare2 = new Internare(false, false, false, false, "Mihai Andrei");
        InternareBuilder builder = new InternareBuilder("Cristi Mihalcea");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNume("Liviu Matei").setPatRabatabil(true).
                setMicDejun(true).setPapuci(false).setHalat(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        System.out.println("\n");

        //pt a doua versiune nu avem nevoie de seterii din internare
        System.out.println("Varianta alternativa");
        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Maria Tataru");
        Internare internare102 = builderAlternativ.build("Delia Enache");
        Internare internare103 = builderAlternativ.build("Ana Popescu");
        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());

    }
}
