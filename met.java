package pari.ParteNuovaMet;

import java.util.Scanner;

public class met {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli il tipo di dato (1:int, 2:double, 3:string, 4:boolean): ");
        int scelta = scanner.nextInt();
        scanner.nextLine(); // consuma il carattere newline rimasto
        switch (scelta) {
            case 1:
                int result1 = addNumbers(3, 4);
                System.out.println("Risultato: " + result1);
                break;
            case 2:
                System.out.println("Inserisci un double: ");
                double doubleValue = scanner.nextDouble();
                double doubleResult = processDouble(doubleValue);
                System.out.println("Risultato: " + doubleResult);
                break;
            case 3:
                System.out.println("Inserisci una stringa: ");
                String stringValue = scanner.nextLine();
                String stringResult = processString(stringValue);
                System.out.println("Risultato: " + stringResult);
                break;
            case 4:
                boolean result4 = pari(5);
                System.out.println("Risultato: " + result4);
                break;
            default:
                System.out.println("Scelta non valida");
                break;
        }
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }

    public static double processDouble(double value) {
        return value * 1.5;
    }

    public static String processString(String value) {
        return value.toUpperCase();
    }

    public static boolean pari(int number) {
        return number % 2 == 0;
    }
}
