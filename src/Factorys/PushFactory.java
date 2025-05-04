package Factorys;

import interfaces.Notificador;
import model.NotificadorPush;

public class PushFactory extends NotificadorFactory{


    @Override
    public Notificador criarNotificador() {
        return new NotificadorPush();
    }
}
