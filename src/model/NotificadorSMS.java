package model;

import interfaces.Notificador;

public class NotificadorSMS implements Notificador {

    @Override
    public void enviarMensagens(String mensagem) {
        System.out.println("SMS ENVIADO "+ mensagem);
    }
}
