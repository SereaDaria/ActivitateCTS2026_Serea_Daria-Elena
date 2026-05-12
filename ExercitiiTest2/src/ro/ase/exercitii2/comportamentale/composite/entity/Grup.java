package ro.ase.exercitii2.comportamentale.composite.entity;

import java.util.ArrayList;
import java.util.List;

public class Grup implements IFlota{
    private String numeGrup;
    private List<IFlota> autobuze;

    public Grup(String numeGrup) {
        this.numeGrup = numeGrup;
        this.autobuze = new ArrayList<IFlota>();
    }

    public void addAutobuz(IFlota autobuz) {
        autobuze.add(autobuz);
    }

    public void removeAutobuz(IFlota autobuz) {
        autobuze.remove(autobuz);
    }

    public IFlota getAutobuz(int index) {
        return autobuze.get(index);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println("Grupa: " + numeGrup);
        for(IFlota autobuz : autobuze) {
            autobuz.afiseazaDetalii(spatii);
        }
    }
}
