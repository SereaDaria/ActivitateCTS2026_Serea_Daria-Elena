package ro.ase.exercitii2.comportamentale.chain.main;

import ro.ase.exercitii2.comportamentale.chain.entity.Client;
import ro.ase.exercitii2.comportamentale.chain.handleri.Notificator;
import ro.ase.exercitii2.comportamentale.chain.handleri.NotificatorEmail;
import ro.ase.exercitii2.comportamentale.chain.handleri.NotificatorManager;
import ro.ase.exercitii2.comportamentale.chain.handleri.NotificatorNrTel;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Popa", "0788123334", "popa@gmail.com");
        Client client2 = new Client("Ana", null, "popa@gmail.com");
        Client client3 = new Client("Dan", null, null);

        Notificator notificatorTel = new NotificatorNrTel();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorTel.setNextNotificator(notificatorEmail);
        notificatorEmail.setNextNotificator(notificatorManager);

        notificatorTel.notifica(client1, "S-a emis factura!");
        notificatorTel.notifica(client2, "S-a emis factura!");
        notificatorTel.notifica(client3, "S-a emis factura!");

    }
}
