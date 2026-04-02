package ro.ase.exercitii.Test6.Main;

import ro.ase.exercitii.Test6.Prototype.Masina;
import ro.ase.exercitii.Test6.Prototype.Sticker;
import ro.ase.exercitii.Test6.SimpleFactory.Entity.Bara;
import ro.ase.exercitii.Test6.SimpleFactory.Entity.IComponenta;
import ro.ase.exercitii.Test6.SimpleFactory.Factory.ComponentaFactory;
import ro.ase.exercitii.Test6.SimpleFactory.Factory.TipComponenta;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina("BMW", 2002);
        Masina masina2 = new Masina("Audi", 2010);
        Masina masina3 = new Masina("Daci", 2012);

        Sticker sticker = new Sticker(masina1);
        Sticker sticker2 = (Sticker) sticker.copiaza();
        Sticker sticker3 = (Sticker) sticker.copiaza();
        Sticker sticker4 = (Sticker) sticker.copiaza();
        sticker.afiseazaSticker();
        sticker2.afiseazaSticker();
        sticker3.afiseazaSticker();
        sticker4.afiseazaSticker();

        ComponentaFactory fabricaComponente = new ComponentaFactory();
        IComponenta bara = fabricaComponente.creazaComponnenta(TipComponenta.BARA, 27);
        bara.afiseazaComponenta();
        IComponenta capota = fabricaComponente.creazaComponnenta(TipComponenta.CAPOTA, 200);
        capota.afiseazaComponenta();
        IComponenta portbagaj = fabricaComponente.creazaComponnenta(TipComponenta.PORTBAGAJ, 348);
        portbagaj.afiseazaComponenta();
        IComponenta usa = fabricaComponente.creazaComponnenta(TipComponenta.USA, 140);
        usa.afiseazaComponenta();
    }
}
