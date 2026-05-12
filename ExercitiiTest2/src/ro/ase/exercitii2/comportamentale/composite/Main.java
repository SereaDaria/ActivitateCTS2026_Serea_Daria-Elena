package ro.ase.exercitii2.comportamentale.composite;

import ro.ase.exercitii2.comportamentale.composite.entity.Autobuz;
import ro.ase.exercitii2.comportamentale.composite.entity.Grup;
import ro.ase.exercitii2.comportamentale.composite.entity.IFlota;

public class Main {
    public static void main(String[] args) {
        IFlota grupMic = new Grup("Grup Mic - 10 locuri");
        IFlota grupMediu = new Grup("Grup Mediu - 30 locuri");
        IFlota grupMare = new Grup("Grup Mare - 50 locuri");

        IFlota autobuz1 = new Autobuz("Mercedes", "A1", 10);
        IFlota autobuz2 = new Autobuz("Mercedes", "A4", 50);
        IFlota autobuz3 = new Autobuz("Mercedes", "A2", 10);
        IFlota autobuz4 = new Autobuz("Mercedes", "A5", 30);
        IFlota autobuz5 = new Autobuz("Mercedes", "A9", 30);
        IFlota autobuz6 = new Autobuz("Mercedes", "A7", 50);

        ((Grup) grupMic).addAutobuz(autobuz1);
        ((Grup) grupMic).addAutobuz(autobuz3);

        ((Grup) grupMediu).addAutobuz(autobuz4);
        ((Grup) grupMediu).addAutobuz(autobuz5);

        ((Grup) grupMare).addAutobuz(autobuz2);
        ((Grup) grupMare).addAutobuz(autobuz6);

        grupMic.afiseazaDetalii("  ");
        System.out.println();
        grupMediu.afiseazaDetalii("  ");
        System.out.println();
        grupMare.afiseazaDetalii("  ");
        System.out.println();

        ((Grup) grupMic).getAutobuz(1).afiseazaDetalii(" ");
        System.out.println();
        ((Grup) grupMediu).removeAutobuz(autobuz4);
        grupMediu.afiseazaDetalii("  ");
    }


}
