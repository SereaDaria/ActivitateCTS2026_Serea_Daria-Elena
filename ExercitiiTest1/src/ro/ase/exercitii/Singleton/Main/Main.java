package ro.ase.exercitii.Singleton.Main;

import ro.ase.exercitii.Singleton.Entity.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie = Agentie.getInstance("Aria", 20000, 200967);
        System.out.println(agentie.getId());

        Agentie agentie2 = Agentie.getInstance("Kuca", 30000, 203967);
        System.out.println(agentie2.getNume());
    }

}
