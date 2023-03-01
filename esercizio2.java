import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {   //inizio main
    
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo numero intero");  // chiedo all'utente il numero da inserire in questo caso un intero
        int numero1 = input.nextInt();

        System.out.println("Inserisci secodno numero intero"); // chiedo secondo numero come riportato sopra
        int numero2 = input.nextInt();

        int resto = numero1 % numero2;      // inizializzo resto

        System.out.println("Il resto tra "+ numero1 + " e " + numero2 + " e' " + resto); //stampo risultato
}
}
