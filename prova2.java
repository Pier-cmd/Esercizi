import java.util.Scanner;

public class prova2 {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a " + cars.length);
        int numero = scanner.nextInt();
        if (numero >= 0 && numero <= cars.length) {
            String auto = cars[numero];
            System.out.println("L'auto selezionata è: " + auto + ", in posizione " + (numero));
        } else {
            System.out.println("Numero non valido.");
        }
    }
}