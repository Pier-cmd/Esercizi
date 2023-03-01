package pari.ParteNuovaMet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SistemaRegistrazione {
    private List<Utente> utentiRegistrati;

    public SistemaRegistrazione() {
        this.utentiRegistrati = new ArrayList<>();
    }

    public void registraUtenteDaTastiera() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo username: ");
        String username = input.nextLine();
        System.out.print("Inserisci la tua password: ");
        String password = input.nextLine();
        System.out.print("Inserisci il tuo livello (1-3)(3 riferito al capo ufficio): ");
        int livello = input.nextInt();
        Utente nuovoUtente = new Utente(username, password, livello);
        this.utentiRegistrati.add(nuovoUtente);
    }

    public void stampaUtenti() {
        for (Utente utente : this.utentiRegistrati) {
            System.out.println("Username: " + utente.getUsername() + ", Password: " + utente.verificaPassword(utente.getPassword()) + ", Livello: " + utente.getLivello());
        }
    }

    public boolean esisteCapo() {
        int numeroCapi = 0;
        for (Utente utente : this.utentiRegistrati) {
            if (utente.getLivello() == 3) {
                numeroCapi++;
                if (numeroCapi > 1) {
                    // Ci sono più di un capo, esco dal ciclo
                    break;
                }
            }
        }
        return numeroCapi == 1;
    }
    

    public static void main(String[] args) {
        SistemaRegistrazione sistema = new SistemaRegistrazione();

        for (int i = 0; i < 3; i++) {
            sistema.registraUtenteDaTastiera();
        }

        // Stampa l'elenco degli utenti registrati
        sistema.stampaUtenti();

        // Verifica se c'è un capo utente
        boolean esisteCapo = sistema.esisteCapo();
        if (esisteCapo) {
            System.out.println("C'è un capo utente.");
        } else {
            System.out.println("Non c'è un capo utente.");
        }
    }
}
