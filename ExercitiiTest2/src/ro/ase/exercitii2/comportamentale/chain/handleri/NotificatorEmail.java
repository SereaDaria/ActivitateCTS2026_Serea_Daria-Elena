package ro.ase.exercitii2.comportamentale.chain.handleri;

import ro.ase.exercitii2.comportamentale.chain.entity.Client;

public class NotificatorEmail extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            System.out.println(client.getNume() + " ai primit mailul: " + mesaj);
        }
        else {
            super.getNextNotificator().notifica(client, mesaj);
        }
    }
}
