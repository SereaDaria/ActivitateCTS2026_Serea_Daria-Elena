package ro.ase.seminar6.Prototype.Main;

import ro.ase.seminar6.Prototype.Entity.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Eze", 21,3,"1234567891011121");
        Rezervare rezervare1 = (Rezervare) rezervare.copiaza();
        rezervare1.setOra(19);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare.toString());
    }
}
