package model;

import interfaces.Notificador;

public class NotificadorPush implements Notificador {


    @Override
    public void enviarMensagens(String mensagem) {
        System.out.println("PUSH ENVIADO "+ mensagem);
    }
}
