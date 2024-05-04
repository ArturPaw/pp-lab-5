

import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        try {
            // Utwórz tablicę people z pięcioma obiektami instancji Person
            Person[] people = new Person[5];

            // Utwórz stałą b (int) o wartości 10
            int b = 10;

            // W bloku try-catch przypisz dla każdej instancji nową instancję Person
            for (int i = 0; i < people.length; i++) {
                people[i] = new Person("Imię " + (i + 1), 30 + i);
            }

            // Wykorzystaj metodę add z MathUtils dla każdej osoby
            for (Person person : people) {
                int sum = MathUtils.add(person.getAge(), b);
                System.out.println("Wynik dodawania wieku " + person.getName() + " i " + b + ": " + sum);

                // Wyślij wiadomość e-mail z wyliczoną wartością
                Messenger messenger = new EmailMessenger();
                messenger.sendMessage("Witaj, " + person.getName() + "! Wynik dodawania wieku i " + b + " to: " + sum);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
