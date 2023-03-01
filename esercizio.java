import java.util.Scanner;

public class esercizio {
  public static void main(String[] args) {
    Scanner intScanner = new Scanner(System.in);
    Scanner floatScanner = new Scanner(System.in);
    Scanner doubleScanner = new Scanner(System.in);
    Scanner longScanner = new Scanner(System.in);
    Scanner booleanScanner = new Scanner(System.in);
    Scanner charScanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);

    System.out.print("Inserisci un intero: ");
    int intValue = intScanner.nextInt();

    System.out.print("Inserisci un float: ");
    float floatValue = floatScanner.nextFloat();

    System.out.print("Inserisci un double: ");
    double doubleValue = doubleScanner.nextDouble();

    System.out.print("Inserisci un long: ");
    long longValue = longScanner.nextLong();

    System.out.print("Inserisci un booleano (true/false): ");
    boolean booleanValue = booleanScanner.nextBoolean();

    System.out.print("Inserisci un carattere: ");
    char charValue = charScanner.next().charAt(0);

    System.out.print("Inserisci una stringa: ");
    String stringValue = stringScanner.nextLine();

    System.out.println("Intero: " + intValue);
    System.out.println("Float: " + floatValue);
    System.out.println("Double: " + doubleValue);
    System.out.println("Long: " + longValue);
    System.out.println("Booleano: " + booleanValue);
    System.out.println("Carattere: " + charValue);
    System.out.println("Stringa: " + stringValue);

    System.out.println("Conversione da char a string: " + String.valueOf(charValue));
    System.out.println("Conversione da string a char: " + stringValue.charAt(0));
  }
}
