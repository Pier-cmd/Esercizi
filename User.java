import java.util.Scanner;

public class User {
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome dell'utente:");
        String name = input.nextLine();

        System.out.println("Inserisci la password dell'utente:");
        String password = input.nextLine();

        User user = new User(name, password);

        System.out.println("Il nome dell'utente è: " + user.name);
        System.out.println("La password dell'utente è: " + user.password);
    }
}
