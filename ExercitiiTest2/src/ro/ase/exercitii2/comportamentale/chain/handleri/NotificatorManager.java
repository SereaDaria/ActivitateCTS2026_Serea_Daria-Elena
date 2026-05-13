package ro.ase.exercitii2.comportamentale.chain.handleri;

import ro.ase.exercitii2.comportamentale.chain.entity.Client;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule manager, agentia nu are date de contact pentru clientul " + client.getNume());
    }
}
