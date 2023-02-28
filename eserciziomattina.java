import java.util.Scanner;

public class eserciziomattina {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("BENVENUTO!!!");
        System.out.println("Inserisci primo numero: ");
        double number1 = input.nextDouble();

        System.out.println("Inserisci secondo numero: ");
        double number2 = input.nextDouble();




        
        System.out.println("Scegli fra queste opzioni: ");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Somma radici quadrate");
        System.out.println("4. Sottrazione radici quadrate");


        int scelta =  input.nextInt();
        double risultato = 0.0;
        String operazione = " ";
        switch (scelta) {
            case 1: 
            risultato =  number1 + number2;
            operazione = ("Somma tra due numeri");
            break;

            case 2:
            risultato = number1 - number2;
            operazione = ("Sottrazione tra due numeri");
            break;

            case 3: 
            double sommaRadice = Math.sqrt(number1) + Math.sqrt(number2);
            operazione = ("Somma della radice quadrata dei due numeri");
            break;

            case 4: 
            double sottrazioneRadice = (Math.sqrt(Math.min(number1, number2)) - Math.max(number1, number2));
            operazione = ("Sottrazione della radice del numero minore meno il numero maggiore");
            break;
            default: 
            System.out.println("Operazione non valida : ");
            return;

            //STAMPO LE INFORMAZIONI SUI NUMERI
        }

            System.out.println("Il risultato della " + operazione + "è " + risultato);
            System.out.println("Il numero risultante è : ");

            if(risultato > 0) {
                System.out.println(" positivo con valore assoluto è : " + risultato);
            }else if (risultato < 0) {
                System.out.println("negativo con valore assoluto " + risultato);
            } else {
                System.out.println("zero");
            }
            if(risultato % 1 == 0) {
                System.out.println("è un intero");
             if((int) risultato % 2 == 0) {
                System.out.println("è pari ");
            } else {
                System.out.println("è dispari");
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
