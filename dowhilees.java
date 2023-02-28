import java.util.Scanner;

public class dowhilees {
    public static void main(String[] args) {         //inizio main
        Scanner scanner = new Scanner(System.in);
        int scelta;
        
        do {                                                        //inizio do-while e menù scelta
            System.out.println("Seleziona un piatto:");
            System.out.println("1 - Pasta al sugo");
            System.out.println("2 - Pizza margherita");
            System.out.println("3 - Mochi: :");
            System.out.println("0 - Esci");
            scelta = scanner.nextInt();
            
            //casi switch, l'utente potrà scegliere tra i piatti inseriti.
            switch (scelta) {
                case 1:
                    System.out.println("Spaghetti alla carbonara");
                    System.out.println("Ingredienti: pennette , pomodori, formaggio (no lattosio)");
                    System.out.println("Prezzo: 7 euro");
                    System.out.println("Disponibilità: 10 porzioni");
                    confermaOrdine(scanner);
                    break;
                case 2:
                    System.out.println("Pizza");
                    System.out.println("Ingredienti: a scelta dal menù");
                    System.out.println("Prezzo: varia da 5 a 9 euro");
                    System.out.println("Disponibilità: 10 pizze");
                    confermaOrdine(scanner);
                    break;
                case 3:
                    System.out.println("Insalata mista");
                    System.out.println("Ingredienti: palline dolci e gommose di riso glutinoso che viene poi cotto a vapore e pressato");
                    System.out.println("Prezzo: 6 euro");
                    System.out.println("Disponibilità: Fino al raggiungimento di poteri da sayan");
                    confermaOrdine(scanner);
                    break;
                case 0:
                    System.out.println("Arrivederci all prossima !");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
        
    }

    //Sezione scelta finale conferma ordine

    public static void confermaOrdine(Scanner scanner) {
        System.out.println("Vuoi confermare l'ordine? (1 = Sì / 2 = No)");
        int risposta = scanner.nextInt();
        
        if (risposta == 1) {
            System.out.println("Ordine confermato. Buon appetito!");
        } else {
            System.out.println("Ordine annullato.");
        }          
    }
}

