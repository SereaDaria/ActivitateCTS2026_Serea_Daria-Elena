package ro.ase.exercitii2.structurale.facade.entity;

import java.util.ArrayList;
import java.util.List;

public class Receptioner {
    private List<Integer> meseLibere;

    public Receptioner() {
        this.meseLibere = new ArrayList<>();

        for(int i = 0; i<=10; i++){
            meseLibere.add(i+1);
        }
    }

    public boolean verificaMasaLibera(int nrMasa){
        return meseLibere.contains(nrMasa);
    }
}
