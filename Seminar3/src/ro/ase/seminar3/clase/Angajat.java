package ro.ase.seminar3.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata = 10;

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();
    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }

    @Override
    public String toString() {
        StringBuilder sbAngajat = new StringBuilder();
        sbAngajat.append("Angajatul {");
        sbAngajat.append(super.toString());
        sbAngajat.append(" Ocupatie: ");
        sbAngajat.append(this.ocupatie);
        sbAngajat.append(" salariul: ");
        sbAngajat.append(this.salariu);
        sbAngajat.append("}");
        return sbAngajat.toString();


    }


    public void afisareVenit() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Angajat.sumaFinantata + " Euro/zi in proiect.");
    }

}