import java.util.Scanner;
import java.util.Random;

public class provaMenu {

    // Dichiarazione delle variabili globali per tenere traccia del budget e del numero di clienti
    static int budgetTotale = 0;
    static int numeroClienti = 0;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Array dei nomi dei piatti
         final String[] nomiPiatti = {"Spaghetti alla carbonara", "Pizza margherita", "Bistecca alla griglia"};

       // Array delle disponibilita' dei piatti
        final int[] disponibilitaPiatti = {10, 20, 5};

        
        // Variabile per tenere traccia del fatto che l'utente voglia continuare ad usare il programma
        boolean continua = true;
        
        // Menu principale per entrare o uscire dal programma
        while (continua) {
            System.out.println("\nBenvenuto nel programma di gestione del ristorante!");
            System.out.println("Scegli un'opzione dal menu sottostante:");
            System.out.println("1. Entra");
            System.out.println("2. Esci");
            System.out.print("Scelta: ");
            int scelta = input.nextInt();
            
            switch (scelta) {
                case 1:
                    // Generazione del budget per il cliente
                    Random random = new Random();
                    int budgetCliente = random.nextInt(50) + 20; // Budget compreso tra 20 e 70 euro
                    
                    // Aggiornamento del budget totale e del numero di clienti
                    budgetTotale += budgetCliente;
                    numeroClienti += 1;
                    
                    System.out.println("\nBenvenuto nel ristorante!");
                    System.out.println("Il tuo budget per questo pasto e': " + budgetCliente + " euro.");
                    
                    // Menu per la gestione dei piatti
                    boolean continuaGestionePiatti = true;
                    while (continuaGestionePiatti) {
                        System.out.println("\nCosa vuoi fare?");
                        System.out.println("1. Compra un piatto");
                        System.out.println("2. Vedi la lista dei piatti");
                        System.out.println("3. Aggiungi un piatto (richiede la password)");
                        System.out.println("4. Esci");
                        System.out.print("Scelta: ");
                        int sceltaGestionePiatti = input.nextInt();
                        
                        switch (sceltaGestionePiatti) {
                            case 1:
                            System.out.println("\nEcco la lista dei piatti disponibili:");
                            System.out.println("1. Spaghetti alla carbonara - 12 euro");
                            System.out.println("2. Pizza margherita - 8 euro");
                            System.out.println("3. Bistecca alla griglia - 20 euro");
                            System.out.print("Quale piatto vuoi acquistare? ");
                            int piattoScelto = input.nextInt();
                            int prezzoPiatto = 0;
                            String nomePiatto = "";
                            switch (piattoScelto) {
                                case 1:
                                    prezzoPiatto = 12;
                                    nomePiatto = "Spaghetti alla carbonara";
                                    break;
                                case 2:
                                    prezzoPiatto = 8;
                                    nomePiatto = "Pizza margherita";
                                    break;
                                case 3:
                                    prezzoPiatto = 20;
                                    nomePiatto = "Bistecca alla griglia";
                                    break;
                                default:
                                    System.out.println("Scelta non valida.");
                                    continue;
                            }
                            if (budgetCliente < prezzoPiatto) {
                                System.out.println("Spiacente, non hai abbastanza budget per questo piatto.");
                            } else {
                                budgetCliente -= prezzoPiatto;
                                System.out.println("Hai acquistato " + nomePiatto + " per " + prezzoPiatto + " euro.");
                            }
                            break;
        
                            case 2:
                                // Implementare la funzionalita' per visualizzare la lista dei piatti e la loro disponibilita'
                                System.out.println("\nCosa vuoi fare?");
                                System.out.println("1. Compra un piatto");
                                System.out.println("2. Vedi la lista dei piatti");
                                System.out.println("3. Aggiungi un piatto (richiede la password)");
                                System.out.println("4. Esci");
                                System.out.print("Scelta: ");
                                int piattoSCe = input.nextInt();

                                switch (sceltaGestionePiatti) {

                                case 2:
                              // Visualizzazione della lista dei piatti e della loro disponibilita'
                              System.out.println("\nEcco la lista dei piatti disponibili:");
                              for (int i = 0; i < nomiPiatti.length; i++) {
                              System.out.println((i+1) + ". " + nomiPiatti[i] + " - " + disponibilitaPiatti[i] + " disponibili");
                            }
                              break;
    
                             }

                                break;
                            case 3:
                                // Verifica della password per l'aggiunta di piatti
                                System.out.print("Inserisci la password: ");
                                String password = input.next();
                                if (password.equals("password")) {
                                    // Implementare la funzionalita' per aggiungere un piatto
                                    System.out.println("Non implementato");
                                } else {
                                    System.out.println("Password errata!");
                                }
                                break;
                            case 4:
                                continuaGestionePiatti = false;
                                break;
                            default:
                                System.out.println("Scelta non valida.");
                                break;
                        }
                    }
                    break;
                case 2:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        
            // Stampa del totale speso e del numero di clienti
    System.out.println("\nGrazie per aver utilizzato il nostro programma!");
    System.out.println("Totale speso dai clienti: " + budgetTotale + " euro.");
    System.out.println("Numero di clienti: " + numeroClienti);
    
    // Chiusura dello scanner
    input.close();
}


    }


        

