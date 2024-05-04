import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan Kowalski", 30);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());

            
            Messenger messenger = new EmailMessenger();

            
            messenger.sendMessage("Witaj, " + person.getName() + "!");
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
