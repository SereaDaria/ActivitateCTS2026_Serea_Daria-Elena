package ro.ase.seminar12.ChainOfResponsability.Entity;

public abstract class Succesor {
    protected Succesor succesor;

    public Succesor() {
        this.succesor = null;
    }

    public void setCalatoriHandler(Succesor succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandaCalatorie(double distanta);


}
