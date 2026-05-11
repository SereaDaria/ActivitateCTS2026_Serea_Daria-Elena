package ro.ase.seminar12.ChainOfResponsability.Entity;

public class CalatorieTroleibuz extends Succesor {
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 3){
            return "Troleibuz";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
