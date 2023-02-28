import java.util.Scanner;

public class prova {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Chiedi all'utente di inserire i due numeri
        System.out.print("Inserisci il primo numero: ");
        double numero1 = input.nextDouble();
        
        System.out.print("Inserisci il secondo numero: ");
        double numero2 = input.nextDouble();
        
        // Chiedi all'utente di scegliere l'operazione
        System.out.println("Scegli l'operazione da eseguire:");
        System.out.println("1 - Somma");
        System.out.println("2 - Sottrazione");
        System.out.println("3 - Somma delle radici quadrate");
        System.out.println("4 - Sottrazione tra la radice del valore più piccolo e più grande");
        int scelta = input.nextInt();
        
        // Esegui l'operazione selezionata dall'utente
        double risultato = 0.0;
        String operazione = "";
        switch (scelta) {
            case 1:
                risultato = numero1 + numero2;
                operazione = "somma";
                break;
            case 2:
                risultato = numero1 - numero2;
                operazione = "sottrazione";
                break;
            case 3:
                risultato = Math.sqrt(numero1) + Math.sqrt(numero2);
                operazione = "somma delle radici quadrate";
                break;
            case 4:
                risultato = Math.sqrt(Math.min(numero1, numero2)) - Math.sqrt(Math.max(numero1, numero2));
                operazione = "sottrazione tra la radice del valore più piccolo e più grande";
                break;
            default:
                System.out.println("Operazione non valida.");
                return;
        }
        
        // Stampa il risultato dell'operazione e le indicazioni sul numero risultante
        System.out.println("Il risultato dell'" + operazione + " è: " + risultato);
        System.out.println("Il numero risultante è:");
        if (risultato > 0) {
            System.out.println("positivo con valore assoluto " + risultato);
        } else if (risultato < 0) {
            System.out.println("negativo con valore assoluto " + Math.abs(risultato));
        } else {
            System.out.println("zero");
        }
        if (risultato % 1 == 0) {
            System.out.println("È un intero.");
            if ((int) risultato % 2 == 0) {
                System.out.println("È pari.");
            } else {
                System.out.println("È dispari.");
            }
        } else {
            int parteIntera = (int) risultato;
            double parteDecimale = risultato - parteIntera;
            System.out.println("Non è un intero.");
            System.out.println("La parte intera è " + parteIntera);
            System.out.println("La parte decimale troncata è " + parteDecimale);
        }
    }
}
