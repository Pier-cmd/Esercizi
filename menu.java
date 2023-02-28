import java.util.Scanner;
import java.util.Random;

public class menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int budgetTotale = 0;
        int numClienti = 0;
        boolean programmaAttivo = true;
        int[] disponibilitaPiatti = new int[5];
        disponibilitaPiatti[0] = 10;
        disponibilitaPiatti[1] = 8;
        disponibilitaPiatti[2] = 15;
        disponibilitaPiatti[3] = 5;
        disponibilitaPiatti[4] = 20;

        while (programmaAttivo) {
            System.out.println("Benvenuto nel Ristorante!");
            System.out.println("Premi 1 per entrare, 2 per uscire");
            int sceltaIniziale = input.nextInt();
            if (sceltaIniziale == 1) {
                int budgetCliente = random.nextInt(50) + 20;
                budgetTotale += budgetCliente;
                numClienti++;
                System.out.println("Il tuo budget è: " + budgetCliente);
                boolean clienteAttivo = true;
                while (clienteAttivo) {
                    System.out.println("Premi 1 per comprare, 2 per vedere la lista, 3 per aggiungere, 4 per uscire");
                    int sceltaCliente = input.nextInt();
                    if (sceltaCliente == 1) {
                        System.out.println("1. Pasta al ragù - 10 euro - pasta, pomodoro, carne");
                        System.out.println("2. Pizza margherita - 8 euro - pizza, pomodoro, mozzarella");
                        System.out.println("3. Pollo al limone - 15 euro - pollo, limone, patate");
                        System.out.println("4. Bruschetta - 5 euro - pane, pomodoro, olio");
                        System.out.println("5. Insalata mista - 7 euro - lattuga, pomodoro, carote");
                        System.out.println("Quale piatto vuoi comprare?");
                        int sceltaPiatto = input.nextInt();
                        int prezzoPiatto = 0;
                        if (sceltaPiatto == 1) {
                            prezzoPiatto = 10;
                        } else if (sceltaPiatto == 2) {
                            prezzoPiatto = 8;
                        } else if (sceltaPiatto == 3) {
                            prezzoPiatto = 15;
                        } else if (sceltaPiatto == 4) {
                            prezzoPiatto = 5;
                        } else if (sceltaPiatto == 5) {
                            prezzoPiatto = 7;
                        }
                        if (prezzoPiatto > budgetCliente) {
                            System.out.println("Non hai abbastanza soldi per comprare questo piatto!");
                        } else if (disponibilitaPiatti[sceltaPiatto - 1] == 0) {
                            System.out.println("Questo piatto non è più disponibile!");
                        } else {
                            budgetCliente -= prezzoPiatto;
                            budgetTotale += prezzoPiatto;
                            disponibilitaPiatti[sceltaPiatto - 1]--;
                            System.out.println("Hai comprato il piatto numero " + sceltaPiatto);
                        }
                    } else { 
                        System.out.println("Piatto non disponibile");
                    }
                 } else if (sceltaCliente == 2) {
                    System.out.println("1. Pasta al ragù - " + disponibilitaPiatti[0] + " disponibili");
                    System.out.println("2. Pizza margherita - " + disponibilitaPiatti[1] + " disponibili");
                    System.out.println("3. Pollo al limone - " + disponibilitaPiatti[2] + " disponibili");
                    System.out.println("4. Bruschetta - " + disponibilitaPiatti[3] + " disponibili");
                    System.out.println("5. Insalata mista - " + disponibilitaPiatti[4] + " disponibili");

                 } else if (sceltaCliente == 3) {
                    System.out.println("Inserisci la password: ");
                    String password = input.next();
                    if(password.equals("password123")) {
                        System.out.println("Premi 1 per resettare le disponibilità, 2 per aggiungere un nuovo piatto");
                        int sceltaAmministratore = input.nextInt();
                        if(sceltaAmministratore == 1) {
                            disponibilitaPiatti[0]=10;
                            disponibilitaPiatti[1]=8;
                            disponibilitaPiatti[2]=15;
                            disponibilitaPiatti[3]=5;
                            disponibilitaPiatti[4]=20;
                        } else if (sceltaAmministratore == 2) {
                            System.out.println("Inserisci il nome del nuovo piatto: ");
                            String nomePiatto = input.next();
                            System.out.println("Inserisci il prezzo del nuovo piatto: ");
                            int prezzoPiatto = input.nextInt();
                            disponibilitaPiatti = addElement(disponibilitaPiatti, 0);
                            System.out.println("Il nuovo piatto è stato aggiunto con successo");

                        }else {
                            System.out.println("SCELTA NON VALIDA ");
                        }
                    }else {
                        System.out.println("PASSWORD NON VALIDA ");
                    }
                 }else if (sceltaCliente == 4) {
                    clienteAttivo = false;
                 } else {
                    System.out.println("SCELTA NON VALIDA");
                 }
                } else if (sceltaIniziale == 2) {
            programmaAttivo = false;
        }else {
            System.out.println("SCELTA NON VALIDA");
        }
    }
    public static int[] addElement(int[] a, int e) {
        int [] newArray = new int[a.length + 1];
        for(int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[newArray.length - 1] = e;
        return newArray;
 }
 }