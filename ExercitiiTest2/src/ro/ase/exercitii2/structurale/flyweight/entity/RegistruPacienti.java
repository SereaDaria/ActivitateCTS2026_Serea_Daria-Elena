package ro.ase.exercitii2.structurale.flyweight.entity;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {
    private Map<String, IPacient> pacienti;

    public RegistruPacienti() {
        this.pacienti = new HashMap<>();
    }

    public IPacient getPacienti(String nume, String nrTelefon, String email) {
        if(pacienti.containsKey(nume)){
            return pacienti.get(nume);
        }
        else{
            IPacient pacient = new Pacient(nume, nrTelefon, email);
            pacienti.put(nume, pacient);
            return pacient;
        }
    }
}
