package ro.ase.seminar8.Facade.facade_singleton;

import ro.ase.seminar8.Facade.Entity.Medic;
import ro.ase.seminar8.Facade.Entity.Pacient;
import ro.ase.seminar8.Facade.Entity.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=5){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(nrPat!=-1){
                    System.out.println("Pacientul " + pacient.getNume() + " trebuie internat in patul " + nrPat);
                    salon.ocupaPat(nrPat);
                }
                else{
                    System.out.println("Nu sunt paturi libere!");
                }
            }
            else{
                System.out.println("Pacientul " + pacient.getNume() + " nu are bilet de trimitere!");
            }
        }
        else{
            System.out.println("Pacientul " + pacient.getNume() + "  nu e suficient de bolnav!");
        }
    }

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
}
