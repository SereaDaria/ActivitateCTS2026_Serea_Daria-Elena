package ro.ase.exercitii2.comportamentale.chain.handleri;

import ro.ase.exercitii2.comportamentale.chain.entity.Client;

public abstract class Notificator {
    private Notificator nextNotificator;

    public Notificator getNextNotificator() {
        return nextNotificator;
    }

    public void setNextNotificator(Notificator nextNotificator) {
        this.nextNotificator = nextNotificator;
    }

    public abstract void notifica(Client client, String mesaj);
}
