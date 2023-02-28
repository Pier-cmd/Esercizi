import java.util.Scanner; 
public class noif {
   

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci un numero intero: ");
    int numero = input.nextInt();

    String tipoNumero = (numero % 2 == 0) ? "pari" : "dispari";

    System.out.println("Il numero " + numero + " è " + tipoNumero);
  }
}

}
