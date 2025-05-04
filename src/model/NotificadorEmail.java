package model;

import interfaces.Notificador;

public class NotificadorEmail implements Notificador {


    @Override
    public void enviarMensagens(String mensagem) {
        System.out.println("EMAIL ENVIADO " + mensagem);
    }
}
