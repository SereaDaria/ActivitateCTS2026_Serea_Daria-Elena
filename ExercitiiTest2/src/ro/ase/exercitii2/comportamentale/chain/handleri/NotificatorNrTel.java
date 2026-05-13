package ro.ase.exercitii2.comportamentale.chain.handleri;

import ro.ase.exercitii2.comportamentale.chain.entity.Client;

public class NotificatorNrTel extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() != null){
            System.out.println(client.getNume() + " ai primit mesajul: " + mesaj);
        }
        else {
            super.getNextNotificator().notifica(client, mesaj);
        }
    }
}
