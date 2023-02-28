import java.util.Scanner;

public class esercizio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dichiarazione delle variabili per i dati dell'account
        String nome = null;
        String cognome = null;
        int eta = 0;
        String dataNascita = null;

        // Dichiarazione della variabile per la password
        String password = "password123";

        // Verifica se i dati dell'account sono già presenti
        boolean datiPresenti = false;
        if (nome != null && cognome != null && eta != 0 && dataNascita != null) {
            datiPresenti = true;
        }

        // Se i dati sono già presenti, richiede la password per modificarli
        if (datiPresenti) {
            System.out.print("Inserire la password per modificare i dati dell'account: ");
            String inputPassword = input.nextLine();
            if (!inputPassword.equals(password)) {
                System.out.println("Password errata. Impossibile modificare i dati dell'account.");
                System.exit(0);
            }
        }

        // Inserimento dei dati dell'account tramite un ciclo while
        while (nome == null) {
            System.out.print("Inserire il nome: ");
            String inputNome = input.nextLine();
            if (!inputNome.isEmpty()) {
                nome = inputNome;
            }
        }

        while (cognome == null) {
            System.out.print("Inserire il cognome: ");
            String inputCognome = input.nextLine();
            if (!inputCognome.isEmpty()) {
                cognome = inputCognome;
            }
        }

        while (eta == 0) {
            System.out.print("Inserire l'età: ");
            int inputEta = input.nextInt();
            input.nextLine();
            if (inputEta > 0) {
                eta = inputEta;
            }
        }

        while (dataNascita == null) {
            System.out.print("Inserire la data di nascita (nel formato gg/mm/aaaa): ");
            String inputDataNascita = input.nextLine();
            if (!inputDataNascita.isEmpty()) {
                dataNascita = inputDataNascita;
            }
        }

        // Stampa dei dati dell'account
        System.out.println("I dati dell'account sono stati salvati con successo:");
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);
        System.out.println("Data di nascita: " + dataNascita);
    }
}
