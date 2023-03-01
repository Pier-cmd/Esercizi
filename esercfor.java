import java.util.Scanner;

public class esercfor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = 15;
        int var2 = 10;
        int var3 = 5;

        System.out.println("Benvenuto scegli la variabile che preferisci e il mio programma conterà");
        int scelta;

        do {
            System.out.println("Seleziona la variabile:");
            System.out.println("1 - 15");
            System.out.println("2 - 10");
            System.out.println("3 - 5 :");
            System.out.println("0 - Esci");

            scelta = scanner.nextInt();

            switch(scelta) {
            case 1:
            contaFinoAvariabile(var);
            break;

            case 2:
            contaFinoAvariabile(var2);
            break;

            case 3:
            contaFinoAvariabile(var3);
            break;

            case 0:
            System.out.println(" Arrivederci ");
            break;

            default:
            System.out.println("Scelta sbagliata: Riprova");
        }
        } while (scelta != 0); }

        public static void contaFinoAvariabile(int variabile) {
            for (int i = 0; i <= variabile; i++) {
                System.out.println(i);

        }
    }
    
}
