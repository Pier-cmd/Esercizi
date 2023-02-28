import java.util.Scanner;
import java.math.*;


public class classeMathe {
    public static void main(String[] args) {    //inizio main

        Scanner input = new Scanner(System.in);


        System.out.println("Dammi un numero intero e ti restituirò la radice quadrata...");
        int numeroRadice = input.nextInt();
        double radiceQuadrata = Math.sqrt(numeroRadice);
        System.out.println("La radice quadrata del numero   "  + numeroRadice + " è " + radiceQuadrata);   //stampo radice quadrata
        

        //Ora passiamo alla seconda fase 
 
        System.out.println("Dammi due numeri interi... ");

        System.out.println("Inserisci il primo numero intero ");  // chiedo all'utente il numero da inserire in questo caso un intero
        int numero1 = input.nextInt();

        System.out.println("Inserisci secodno numero intero "); // chiedo secondo numero come riportato sopra
        int numero2 = input.nextInt();

        int numMaggiore = Math.max(numero1, numero2);  //eseguo comparazione con la funzione math
        int numMinore = Math.min(numero1, numero2);

        System.out.println("Il numero maggiore è  " + numMaggiore);
        System.out.println("Il numero minore è  " + numMinore);

        // passo a funzione random

        System.out.println("Ora ti fornirò un numero da giocare alla lotteria ;)...");

        int randomNum = (int)(Math.random()*100); // range 0 to 99            //funzione random
        System.out.println("Il numero random è  " + randomNum);

  }
}


/*import org.apache.commons.lang3.StringUtils;

class Main
{
public static void main(String[] args)
{
String s1 = new String("Compare two strings in Java");
String s2 = new String("Compare two strings in Java");

// Restituisce true
System.out.println(StringUtils.equals(s1, s2));

// Restituisce true
System.out.println(StringUtils.compare(s1, s2) == 0);
}
}
 */