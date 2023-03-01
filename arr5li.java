package pari.ParteNuovaMet;

import java.util.ArrayList;
import java.util.Scanner;

public class arr5li {

    public static void main(String[] args) {

        //Inizializzo i tre array
        ArrayList<String> nomi = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();
        ArrayList<Integer> eta = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);


        //Richiesta all'utente
        System.out.print("Quanti utenti vuoi registrare? ");
        int numUtenti = scanner.nextInt();

        //Si chiede all'utente di inserire i dati da inserire negli arrayList
        for (int i = 0; i < numUtenti; i++) {
            System.out.println("Inserisci dati utente " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Password: ");
            String pass = scanner.next();
            System.out.print("Età: ");
            int age = scanner.nextInt();

            nomi.add(nome);
            password.add(pass);
            eta.add(age);
        }
        
        //Stampo la lista
        System.out.println("Elenco utenti registrati:");
        for (int i = 0; i < nomi.size(); i++) {
            System.out.println("Nome: " + nomi.get(i) + ", Password: " + password.get(i) + ", Età: " + eta.get(i));
        }

        //Chiedo all'utente se vuole modificare un utente esistente 
        System.out.print("Vuoi modificare un utente? (s/n) ");
        String risposta = scanner.next();
        if (risposta.equalsIgnoreCase("s")) {
            System.out.print("Quale utente vuoi modificare? (inserisci il nome) ");
            String nomeDaModificare = scanner.next();


            //Utilizzo un for per scorrere l'array e cercare un utente già inserito
            //se viene trovato vengono richiesti i nuovi dati e successivamente sostituiti
            boolean utenteTrovato = false;
            for (int i = 0; i < nomi.size(); i++) {
                if (nomi.get(i).equalsIgnoreCase(nomeDaModificare)) {
                    System.out.println("Utente trovato: Nome: " + nomi.get(i) + ", Password: " + password.get(i) + ", Età: " + eta.get(i));
                    System.out.println("Inserisci i nuovi dati per questo utente:");
                    System.out.print("Nuovo nome: ");
                    String nuovoNome = scanner.next();
                    System.out.print("Nuova password: ");
                    String nuovaPass = scanner.next();
                    System.out.print("Nuova età: ");
                    int nuovaEta = scanner.nextInt();

                    nomi.set(i, nuovoNome);
                    password.set(i, nuovaPass);
                    eta.set(i, nuovaEta);
                    utenteTrovato = true;
                    break;
                }
            }
            if (!utenteTrovato) {
                System.out.println("Nessun utente trovato con il nome inserito.");
            } else {
                System.out.println("Elenco utenti aggiornato:");
                for (int i = 0; i < nomi.size(); i++) {
                    System.out.println("Nome: " + nomi.get(i) + ", Password: " + password.get(i) + ", Età: " + eta.get(i));
                }
            }
        }
    }

}

