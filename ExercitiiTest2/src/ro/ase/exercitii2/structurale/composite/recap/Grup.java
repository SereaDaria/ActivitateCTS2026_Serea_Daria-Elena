package ro.ase.exercitii2.structurale.composite.recap;

import java.util.ArrayList;
import java.util.List;

public class Grup implements IFlota {
   private List<IFlota> autobuze;
   String numeGrup;

   public Grup(String numeGrup) {
       this.autobuze = new ArrayList<>();
       this.numeGrup = numeGrup;
   }


   public void addAutobuz(IFlota autobuz){
       autobuze.add(autobuz);
   }

   public void removeAutobuz(IFlota autobuz){
       autobuze.remove(autobuz);
   }

   public IFlota getAutobuz(int index){
       return autobuze.get(index);
   }

    @Override
    public void afiseaza() {
        System.out.println("Grupa " + numeGrup);
        for(IFlota autobuz : autobuze){
            autobuz.afiseaza();
        }
    }
}
