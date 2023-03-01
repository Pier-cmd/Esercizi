import java.util.Scanner;
import java.util.Random;

public class prova2Menu {

    private static final Object PASSWORD = null;
    // Dichiarazione delle variabili globali per tenere traccia del budget e del numero di clienti
    static int budgetTotale = 0;
    static int numeroClienti = 0;
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Array dei nomi dei piatti
        String[] nomiPiatti = {"Spaghetti alla carbonara", "Pizza margherita", "Bistecca alla griglia"};

        // Array delle disponibilità dei piatti
        int[] disponibilitaPiatti = {10, 20, 5};

        
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
                    System.out.println("Il tuo budget per questo pasto è: " + budgetCliente + " euro.");
                    
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
                                    System.out.println("Scelta non valida!");
                                    break;
                            }
                            
                            // Controllo disponibilità piatto
                            int indicePiattoScelto = piattoScelto - 1;
                            if (disponibilitaPiatti[indicePiattoScelto] == 0) {
                                System.out.println("Spiacenti, il piatto selezionato non è al momento disponibile.");
                                continue;
                            }
                            
                            // Controllo budget cliente
                            if (budgetCliente < prezzoPiatto) {
                                System.out.println("Spiacenti, il tuo budget non è sufficiente per acquistare questo piatto.");
                                continue;
                            }
                            
                            // Acquisto piatto
                            System.out.println("Hai acquistato il piatto: " + nomePiatto);
                            budgetCliente -= prezzoPiatto;
                            budgetTotale += prezzoPiatto;
                            disponibilitaPiatti[indicePiattoScelto] -= 1;
                            System.out.println("Il tuo budget rimanente è: " + budgetCliente + " euro.");
                        }
                        break; }
                    case 2:
                        // Visualizzazione delle statistiche del ristorante
                        System.out.println("\nStatistiche del ristorante:");
                        System.out.println("Numero di clienti: " + numeroClienti);
                        System.out.println("Budget totale: " + budgetTotale + " euro");
                        System.out.println("Disponibilità piatti:");
                        for (int i = 0; i < nomiPiatti.length; i++) {
                            System.out.println(nomiPiatti[i] + ": " + disponibilitaPiatti[i]);
                        } 

                        case 3:
                         System.out.print("Inserisci la password: ");
                         String passwordInserita = input.next();
                         if (passwordInserita.equals(PASSWORD)) {
                             System.out.print("Inserisci il nome del piatto: ");
                             String nuovoPiatto = input.next();
                             System.out.print("Inserisci il prezzo del piatto: ");
                             int nuovoPrezzo = input.nextInt();
                             int nuovaDisponibilita = 0;
                             while (nuovaDisponibilita <= 0) {
                                 System.out.print("Inserisci la disponibilità del piatto: ");
                                 nuovaDisponibilita = input.nextInt();
                                 if (nuovaDisponibilita <= 0) {
                                     System.out.println("La disponibilità del piatto deve essere maggiore di zero!");
                                 }
                             }
                             String[] nuoviNomiPiatti = new String[nomiPiatti.length + 1];
                             int[] nuoveDisponibilitaPiatti = new int[disponibilitaPiatti.length + 1];
                             for (int i = 0; i < nomiPiatti.length; i++) {
                                 nuoviNomiPiatti[i] = nomiPiatti[i];
                                 nuoveDisponibilitaPiatti[i] = disponibilitaPiatti[i];
                             }
                             nuoviNomiPiatti[nomiPiatti.length] = nuovoPiatto;
                             nuoveDisponibilitaPiatti[disponibilitaPiatti.length] = nuovaDisponibilita;
                             nomiPiatti = nuoviNomiPiatti;
                             disponibilitaPiatti = nuoveDisponibilitaPiatti;
                             System.out.println("Il piatto è stato aggiunto con successo!");
                         } else {
                             System.out.println("Password errata!");
                         }
                        continua = false;
                        break;
                    default:
                        System.out.println("Scelta non valida!");
                        break;
                }
            }
            
            input.close();
        }
        }



