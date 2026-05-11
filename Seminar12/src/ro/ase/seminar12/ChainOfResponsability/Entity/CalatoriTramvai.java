package ro.ase.seminar12.ChainOfResponsability.Entity;

public class CalatoriTramvai extends Succesor {


    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 10){
            return "Tramvai";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
