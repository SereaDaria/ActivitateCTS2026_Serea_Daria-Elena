package ro.ase.exercitii2.structurale.proxy.main;

import ro.ase.exercitii2.structurale.proxy.entity.ProxyRezervare;
import ro.ase.exercitii2.structurale.proxy.entity.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, "Ana", 5);
        Rezervare rezervare2 = new Rezervare(2, "Dan", 2);
        rezervare1.realizeazaRezervare();
        rezervare2.realizeazaRezervare();
        System.out.println();

        ProxyRezervare proxyRezervare1 = new ProxyRezervare(rezervare1);
        proxyRezervare1.realizeazaRezervare();
        ProxyRezervare proxyRezervare2 = new ProxyRezervare(rezervare2);
        proxyRezervare2.realizeazaRezervare();
    }
}
