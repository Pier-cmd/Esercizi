import java.util.Scanner;

public class calcolatrice {        
    
public static void main(String[] args) {                //inizio main
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome , select the program to launch  (Calculator / Calendar )");   // Faccio scegliere all'utente se                                                 
    String scelta = input.next();                                                               // desidera avviare Calcolatrice o Calendario
    if(scelta.equalsIgnoreCase("Calculator")) {

        //INIZIO PROGRAMMA CALCOLATRICE

    System.out.println("Welcome to Java Calculator.. "); 

    System.out.println("Insert first number please :  ");         //chiedo primo numero
    double integer1 = input.nextDouble();

    System.out.println("Insert second number please :  ");    //chiedo secondo numero
    double integer2 = input.nextDouble();

    System.out.println("Chose operation please : +, -, *, %  ");     //chiedo di inserire l'operazione da eseguire
    String operazione = input.next();

    double risultato = 0;           //variabile per risultato

    if (operazione.equals("+")) {                 //In queste condizioni controllo
        risultato = integer1 + integer2;                   //quale operazione ha richiesto di
    } else if (operazione.equals("-")) {         //di effettuare l'utente e di conseguenza
        risultato = integer1 - integer2;                  //assegno il risultato 
    } else if (operazione.equals("*")) {
        risultato = integer1 * integer2;
    } else if (operazione.equals("%")) {
        risultato = integer1 % integer2;
    } else {
        System.out.println("Operation is not valid. ");     //operazione on valida a causa di un carattere null
        return;
    }

    System.out.println("Result is : " + risultato);          //stampo risultato


    double radiceQuadrata = Math.sqrt(risultato);       //inizializzo funzione radice quadrata

    System.out.println("Would you like the square root?  (YES/NO)  ");  //chiedo all'utente se gradirebbe ricevere la radice quadrata "Da migliorare "!!!!
    String answer = input.next();

    if (answer.equalsIgnoreCase("yes")) {          //ricevo la risposta affermatica e stampo risultato
        System.out.println("You've choise YES");
        System.out.println("La radice quadrata del numero   "  + risultato + " è " + radiceQuadrata);


    }else if (answer.equalsIgnoreCase("no")) {   //ricevo risposta negativa
        System.out.println("You've choise NO");
        System.out.println("Thanks for choosing JAVA CALCULATOR ");
    }else {
        System.out.println("Choise not valid!!!");   //Risposta non valida
    }

    //FINE PROGRAMMA CALCOLATRICE 

 } else {  //INIZIO PROGRAMMA CALENDARIO

    System.out.println("Inserisci un numero da 1 a 7:");
    int day = input.nextInt();
    String dayName;

    switch(day) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Giorno non valido";
            break;
    }

    System.out.println(dayName);
}
    }//FINE 
 } //FINE MAIN
