package Factorys;

import interfaces.Notificador;
import model.NotificadorPush;

public class SMSFactory extends NotificadorFactory{


    @Override
    public Notificador criarNotificador() {
        return new NotificadorPush();
    }
}
