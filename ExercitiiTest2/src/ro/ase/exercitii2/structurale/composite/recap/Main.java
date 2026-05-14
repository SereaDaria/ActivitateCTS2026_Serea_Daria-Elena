package ro.ase.exercitii2.structurale.composite.recap;

public class Main {
    public static void main(String[] args) {
        IFlota grupMic = new Grup("Grup Mic");
        IFlota grupMediu = new Grup("Grup Mediu");
        IFlota grupMare = new Grup("Grup Mare");

        IFlota bus1 = new Autobuz(23, 10);
        IFlota bus2 = new Autobuz(24, 30);
        IFlota bus3 = new Autobuz(25, 50);
        IFlota bus4 = new Autobuz(26, 10);
        IFlota bus5 = new Autobuz(27, 50);

        ((Grup)grupMic).addAutobuz(bus1);
        ((Grup)grupMediu).addAutobuz(bus2);
        ((Grup)grupMare).addAutobuz(bus3);
        ((Grup)grupMic).addAutobuz(bus4);
        ((Grup)grupMare).addAutobuz(bus5);

        grupMic.afiseaza();
        grupMare.afiseaza();
        grupMediu.afiseaza();

    }
}
