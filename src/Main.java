import Factorys.EmailFactory;
import Factorys.NotificadorFactory;
import Factorys.PushFactory;
import Factorys.SMSFactory;
import interfaces.Notificador;

public class Main {
    public static void main(String[] args) {

        NotificadorFactory nfe = new EmailFactory();
        NotificadorFactory nfs = new SMSFactory();
        NotificadorFactory nfp = new PushFactory();

        Notificador nt = nfe.orderNotificador();

        nt.enviarMensagens("OLA MUNDO");

    }
}