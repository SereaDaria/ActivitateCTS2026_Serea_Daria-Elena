package ro.ase.exercitii2.structurale.facade.entity;

public class FacadeRestaurant {
    public String verificaDisponibilitateMasa(int nrMasa){
        Receptioner receptioner = new Receptioner();

        if(receptioner.verificaMasaLibera(nrMasa)){
            Chelner chelner = new Chelner();

            if(chelner.esteMasaCurata(nrMasa)){
                if(chelner.esteMasaCuServetele(nrMasa)){
                    return "Masa este pregatita";
                }
                else{
                    return "Masa are nevoie de servetele";
                }
            }
            else{
                return "Masa nu este curata";
            }
        }
        else{
            return "Masa nu este libera";
        }
    }
}
