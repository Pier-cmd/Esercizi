import java.util.Scanner;

public class loop {
    public static void main(String[] args) {            //inizio main
         Scanner input = new Scanner(System.in);
       

        int scelta = 0;          //inizializzo variabile

        System.out.println("Benvenuto!!!");

        while (scelta < 1 || scelta > 10) {            //inizio ciclo while
            System.out.print("Inserisci un numero da 1 a 10: ");
            scelta = input.nextInt();
        }
        if (scelta % 2 == 0) {
            System.out.println(scelta + " il numero è pari. La sua divisione è " + (scelta/2));
        } else {
            System.out.println(scelta + " il numero è dispari. Il suo modulo diviso per due è " + (scelta%2));
        }
    }
}
