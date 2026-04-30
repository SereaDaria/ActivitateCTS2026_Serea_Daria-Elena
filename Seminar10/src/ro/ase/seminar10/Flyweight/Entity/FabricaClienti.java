package ro.ase.seminar10.Flyweight.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FabricaClienti {
    private Map<String, IClient> clienti = new HashMap<>();

    public IClient getClient(String nume, String nrTelefon, String email) {
           IClient client = clienti.get(nrTelefon);
           if(client == null) {
               client = new Client(nume, nrTelefon, email);
               clienti.put(nrTelefon, client);
           }
           return client;
    }
}
