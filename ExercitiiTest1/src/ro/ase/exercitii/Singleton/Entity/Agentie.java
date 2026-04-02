package ro.ase.exercitii.Singleton.Entity;

public class Agentie {
    private String nume;
    private float capital;
    private int id;

    private static Agentie instantaAgentie = null;

    private Agentie(String nume, float capital, int id) {
        this.nume = nume;
        this.capital = capital;
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public float getCapital() {
        return capital;
    }

    public int getId() {
        return id;
    }

    public static synchronized Agentie getInstance(String nume, float capital, int id){
        if(instantaAgentie == null) {
            instantaAgentie = new Agentie(nume, capital, id);
        }
        return instantaAgentie;
    }
}
