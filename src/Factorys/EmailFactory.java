package Factorys;

import interfaces.Notificador;
import model.NotificadorEmail;

public class EmailFactory extends NotificadorFactory{

    @Override
    public Notificador criarNotificador() {
        return new NotificadorEmail();
    }
}
