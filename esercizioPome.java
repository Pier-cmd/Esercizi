import java.util.Scanner;
public class esercizioPome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String text;
        boolean ins;

        // Input dei dati , richiedo i dati all'utente.
        System.out.println("Inserisci un numero:");
        number = input.nextInt();

        System.out.println("Inserisci una stringa:");
        input.nextLine(); 
        text = input.nextLine();

        System.out.println("Inserisci un valore booleano (true/false):");
        ins = input.nextBoolean();

        // Menu di selezione dell'operazione
        System.out.println("Scegli un'operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("5. Substring");
        System.out.println("6. Concatenamento");
        System.out.println("7. Casting int to double");
        System.out.println("8. Opposto booleano");

        int scelta = input.nextInt();
        switch (scelta) {
            case 1:
                System.out.println("Inserisci un secondo numero:");
                int summand = input.nextInt();
                int sum = number + summand;
                System.out.println("La somma dei due numeri è: " + sum);
                break;
            case 2:
                System.out.println("Inserisci un secondo numero:");
                int subtrahend = input.nextInt();
                int difference = number - subtrahend;
                System.out.println("La differenza tra i due numeri è: " + difference);
                break;
            case 3:
                System.out.println("Inserisci un secondo numero:");
                int factor = input.nextInt();
                int product = number * factor;
                System.out.println("Il prodotto dei due numeri è: " + product);
                break;
            case 4:
                System.out.println("Inserisci un secondo numero diverso da zero:");
                int divisor = input.nextInt();
                double quotient = (double) number / divisor;
                System.out.println("Il quoziente tra i due numeri è: " + quotient);
                break;
            case 5:
                System.out.println("Inserisci un indice di inizio (0-" + (text.length() - 1) + "):");
                int start = input.nextInt();
                System.out.println("Inserisci un indice di fine (" + start + "-" + (text.length() - 1) + "):");
                int end = input.nextInt();
                String substring = text.substring(start, end);
                System.out.println("La sottostringa selezionata è: " + substring);
                break;
            case 6:
                System.out.println("Inserisci un'altra stringa da concatenare:");
                String concat = input.next();
                String concatenated = text.concat(concat);
                System.out.println("La stringa concatenata è: " + concatenated);
                break;
            case 7:
                System.out.println("Inserisci il valore intero da convertire:");
                int intValue = input.nextInt();
                double doubleValue = (double) intValue;
                System.out.println("Il valore convertito in double è: " + doubleValue);
                break;
            case 8:
                boolean opposite = !ins;
                System.out.println("Il valore booleano opposto è: " + opposite);
                break;
            default:
                System.out.println("Operazione non valida");
               

} 
    }
}
