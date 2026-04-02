package ro.ase.exercitii.Test5.Singleton;

import ro.ase.exercitii.Test5.SimpleFactory.Entity.AMasina;

public class Service implements IService {
    private AMasina masinaCurenta;
    private String nume;
    private static Service instantaService = null;

    private Service(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public static synchronized Service getIntantaService(String nume){
        if(instantaService == null)
        {
            instantaService = new Service(nume);
        }
        return instantaService;
    }


    @Override
    public void afiseaza(AMasina masina, String nume) {
        this.masinaCurenta = masina;
        System.out.println("Service-ul " + this.nume + " a acceptat masina " + this.masinaCurenta);
    }
}
