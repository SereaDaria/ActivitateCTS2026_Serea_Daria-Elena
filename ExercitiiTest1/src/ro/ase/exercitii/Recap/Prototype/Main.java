package ro.ase.exercitii.Recap.Prototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Ana", 733333444);
        Rezervare rezervare2 = (Rezervare) rezervare.copiaza();
        System.out.println(rezervare.toString());
        rezervare2.setNrTelefon(666766);
        System.out.println(rezervare2.toString());

    }
}
