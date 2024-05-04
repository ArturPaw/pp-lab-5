

import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan Kowalski", 30);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());

            // Utwórz obiekt typu EmailMessenger
            Messenger messenger = new EmailMessenger();

            // Dodaj dwie liczby
            int a = 10;
            int b = 20;
            int sum = MathUtils.add(a, b);

            // Wyświetl wynik dodawania
            System.out.println("Wynik dodawania " + a + " i " + b + ": " + sum);

            // Wyślij wiadomość e-mail
            messenger.sendMessage("Witaj, " + person.getName() + "! Wynik dodawania " + a + " i " + b + " to: " + sum);
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
