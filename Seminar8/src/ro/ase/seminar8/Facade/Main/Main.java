package ro.ase.seminar8.Facade.Main;

import ro.ase.seminar8.Facade.Entity.Medic;
import ro.ase.seminar8.Facade.Entity.Pacient;
import ro.ase.seminar8.Facade.Entity.Salon;
import ro.ase.seminar8.Facade.facade_singleton.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu", 7);
        Medic medic = new Medic("Neagu");
        Salon salon = Salon.getInstance();

        if(pacient1.getGravitate()>=5){
            if(medic.areBiletDeTrimitere(pacient1)){
                int nrPat = salon.suntPaturiLibere();
                if(nrPat!=-1){
                    System.out.println("Pacientul " + pacient1.getNume() + " trebuie internat in patul " + nrPat);
                    salon.ocupaPat(nrPat);
                }
            }
        }
        SpitalFacade facade = new SpitalFacade(new Medic("Gogonea"), Salon.getInstance());
        Pacient pacient2 = new Pacient("Popa", 2);
        Pacient pacient3 = new Pacient("Nedelcu", 5);
        Pacient pacient4 = new Pacient("Ana", 9);
        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);
        facade.interneazaPacient(pacient4);
    }
}
