package ro.ase.seminar8.Proxy.proxy;

import ro.ase.seminar8.Proxy.Entity.ISpital;
import ro.ase.seminar8.Proxy.Entity.Pacient;

public class ProxyCuAsigurare implements ISpital {
    private ISpital spital;

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        }
        else{
            System.out.println("Pacientul nu are asigurare!");
        }
    }
}
