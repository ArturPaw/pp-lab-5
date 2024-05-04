package company.implementations;

import company.interfaces.Messenger;

public class EmailMessenger implements Messenger {

    @Override
    public void sendMessage(String message) {
        System.out.println("Wysyłam wiadomość e-mail: " + message);
    }
}
