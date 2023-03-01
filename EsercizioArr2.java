package SLIDE;


import java.util.Scanner;

public class EsercizioArr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INIZIALIZZO ARRAY DI STRINGHE E DI INTERI
        int[] numeri = { 1, 2, 3, 4, 5 };
        String[] stringhe = { "Dovahkiin", "Ciao", "Sangue di drago", "Thane" };
        //RICHIESTA ALL'UTENTE
        while (true) {
            System.out.println("Scegliere un'opzione:");
            System.out.println("1 - Visualizza array numeri");
            System.out.println("2 - Visualizza array stringhe");
            System.out.println("3 - Aggiungi un numero all'array numeri");
            System.out.println("4 - Aggiungi una stringa all'array stringhe");
            System.out.println("0 - Esci");

            int scelta = scanner.nextInt();
        //VISUALIZZA ARRAY NUMERI
            switch (scelta) {
                case 1:
                    System.out.println("Array numeri:");
                    for (int i = 0; i < numeri.length; i++) {
                        int numero = numeri[i];
                        System.out.println(numero);
                    }
                    System.out.println();
                    break;
        //VISUALIZZA ARRAY STRINGHE
                case 2:
                    System.out.println("Array stringhe:");
                    for (int i = 0; i < stringhe.length; i++) {
                        String stringa = stringhe[i];
                        System.out.println(stringa);
                    }
                    case 3:
                    System.out.println("Inserire un numero da aggiungere:");
                    int numeroDaAggiungere = scanner.nextInt();
                    int[] nuovoArrayNumeri = new int[numeri.length + 1];
                    for (int i = 0; i < numeri.length; i++) {
                        nuovoArrayNumeri[i] = numeri[i];
                    }
                    nuovoArrayNumeri[numeri.length] = numeroDaAggiungere;
                    numeri = nuovoArrayNumeri;
                    break;

                case 4:
                    System.out.println("Inserire una stringa da aggiungere:");
                    String stringaDaAggiungere = scanner.next();
                    String[] nuovoArrayStringhe = new String[stringhe.length + 1];
                    for (int i = 0; i < stringhe.length; i++) {
                        nuovoArrayStringhe[i] = stringhe[i];
                    }
                    nuovoArrayStringhe[stringhe.length] = stringaDaAggiungere;
                    stringhe = nuovoArrayStringhe;
                    break;

                case 0:
                    boolean continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
                }
            }
        }
    }