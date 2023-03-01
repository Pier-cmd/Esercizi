package pari.ParteNuovaMet;
import java.util.ArrayList;
import java.util.Scanner;

public class Squadra {
    private String nome;
    private ArrayList<Giocatore> titolari;
    private ArrayList<Giocatore> riserve;
    private Dirigenza dirigenza;

    public Squadra(String nome) {
        this.nome = nome;
        this.titolari = new ArrayList<Giocatore>();
        this.riserve = new ArrayList<Giocatore>();
        this.dirigenza = new Dirigenza();
    }

    public void inserisciGiocatore(Giocatore giocatore, boolean titolare) {
        if (titolare) {
            this.titolari.add(giocatore);
        } else {
            this.riserve.add(giocatore);
        }
    }

   
    public void stampaSquadra() {
        System.out.println("Squadra: " + this.nome);
        System.out.println("Titolari:");
        for (Giocatore giocatore : this.titolari) {
            System.out.println(giocatore.getNome() + " " + giocatore.getCognome());
        }
        System.out.println("Riserve:");
        for (Giocatore giocatore : this.riserve) {
            System.out.println(giocatore.getNome() + " " + giocatore.getCognome());
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creazione squadra
        System.out.print("Inserisci il nome della squadra: ");
        String nomeSquadra = input.nextLine();
        Squadra squadra = new Squadra(nomeSquadra);

        // Inserimento giocatori
        while (true) {
            System.out.print("Inserisci il nome del giocatore (o \"fine\" per terminare): ");
            String nomeGiocatore = input.nextLine();
            if (nomeGiocatore.equals("fine")) {
                break;
            }
            System.out.print("Inserisci il cognome del giocatore: ");
            String cognomeGiocatore = input.nextLine();
            Giocatore giocatore = new Giocatore(nomeGiocatore, cognomeGiocatore);
            System.out.print("Il giocatore è titolare? (s/n): ");
            String scelta = input.nextLine();
            boolean titolare = scelta.equals("s");
            squadra.inserisciGiocatore(giocatore, titolare);
        }

        

        // Stampa squadra
        squadra.stampaSquadra();

        input.close();
    }
}







   
