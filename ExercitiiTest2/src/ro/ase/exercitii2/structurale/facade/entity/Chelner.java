package ro.ase.exercitii2.structurale.facade.entity;

import java.util.ArrayList;
import java.util.List;

public class Chelner {
    private List<Boolean> meseCurate;
    private List<Boolean> meseCuServetele;

    public Chelner() {
        this.meseCurate = new ArrayList<>();
        this.meseCuServetele = new ArrayList<>();

        for(int i = 0; i<15; i++)
        {
            if(i<6)
            {
                this.meseCurate.add(true);
            }
            else
            {
                this.meseCurate.add(false);
            }
        }

        for(int i = 0; i<15; i++)
        {
            if(i<4)
            {
                this.meseCuServetele.add(false);
            }
            else
            {
                this.meseCuServetele.add(true);
            }
        }
    }

    public boolean esteMasaCurata(int nrMasa){
        return meseCurate.get(nrMasa);
    }

    public boolean esteMasaCuServetele(int nrMasa){
        return meseCuServetele.get(nrMasa);
    }
}
