package ro.ase.seminar12.ChainOfResponsability.Entity;

public class CalatorieAutobuz extends Succesor {
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 5) {
            return "Autobuz";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
