package Factorys;

import interfaces.Notificador;

public abstract class NotificadorFactory {

    public Notificador orderNotificador(){
        Notificador device = null;

        device = criarNotificador();

        return device;
    }

    public abstract Notificador criarNotificador();
}
