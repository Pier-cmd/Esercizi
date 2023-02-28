import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();

        // Utilizziamo un ciclo for per iterare attraverso la stringa
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch);
        }
    }
}