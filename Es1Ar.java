package SLIDE;

import java.util.Scanner;

public class Es1Ar {
    public static void main(String[] args) {
        // crea un array vuoto di lunghezza 4
        String[] array = new String[4];
        
        
        Scanner scanner = new Scanner(System.in);
        
        // richiedi all'utente di inserire nome, cognome, email ed età
        System.out.print("Inserisci il nome: ");
        array[0] = scanner.nextLine();
        
        System.out.print("Inserisci il cognome: ");
        array[1] = scanner.nextLine();
        
        System.out.print("Inserisci l'email: ");
        array[2] = scanner.nextLine();
        
        System.out.print("Inserisci l'età: ");
        array[3] = scanner.nextLine();
        
        // stampa tutti gli elementi dell'array in fila senza andare a capo
        System.out.print(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
    }
}
