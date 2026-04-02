package ro.ase.exercitii.Test4.Main;

import ro.ase.exercitii.Test4.Prototype.Reteta;
import ro.ase.exercitii.Test4.Singleton.ConfiguratieSpital;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ConfiguratieSpital config = new ConfiguratieSpital();

        ConfiguratieSpital config = ConfiguratieSpital.getIntanta(2, "JDHIDJIFJE");
        System.out.println(config.getVersiuneSoftware());
        config.afiseaza();
        ConfiguratieSpital config2 = ConfiguratieSpital.getIntanta(5, "JDHIDJIFJE");
        System.out.println(config2.getVersiuneSoftware());
        config2.afiseaza();


        Map<String, Double> listaMedicamente = new HashMap<String, Double>();
        listaMedicamente.put("Paracaetamol", 10.2);
        listaMedicamente.put("Strepsils", 20.5);

        Reteta reteta = new Reteta(listaMedicamente);
        Reteta reteta2 = (Reteta) reteta.copiaza();

        System.out.println(reteta);
        System.out.println(reteta2);

    }
}
