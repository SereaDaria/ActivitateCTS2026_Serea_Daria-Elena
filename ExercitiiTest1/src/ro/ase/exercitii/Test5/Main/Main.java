package ro.ase.exercitii.Test5.Main;

import ro.ase.exercitii.Test5.SimpleFactory.Entity.AMasina;
import ro.ase.exercitii.Test5.SimpleFactory.Factory.MasinaFactory;
import ro.ase.exercitii.Test5.SimpleFactory.Factory.TipMasina;
import ro.ase.exercitii.Test5.Singleton.Service;

public class Main {
    public static void main(String[] args) {
        Service service = Service.getIntantaService("Service La Costica");

        MasinaFactory fabricaMasina = new MasinaFactory();
        AMasina masina1 = fabricaMasina.getMasina(TipMasina.SEDAN, "B102GHJ", "4 usi");
        AMasina masina2 = fabricaMasina.getMasina(TipMasina.SUV, "B102GHJ", "150 cai");
        AMasina masina3 = fabricaMasina.getMasina(TipMasina.VAN, "B102GHJ", "6 usi");
        AMasina masina4 = fabricaMasina.getMasina(TipMasina.SUV, "B102GHJ", "200 cai");

        service.afiseaza(masina1, "lala");
        service.afiseaza(masina2, "service");
        service.afiseaza(masina3, "alt service");
        service.afiseaza(masina4, "service 2");

    }
}
