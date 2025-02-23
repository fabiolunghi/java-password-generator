
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = scan.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String cognome = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = scan.nextLine();

        System.out.println("Inserisci il giorno della tua data di nascita");
        int giornoNascita = scan.nextInt();
        
        System.out.println("Inserisci il mese della tua data di nascita");
        int meseNascita = scan.nextInt();

        System.out.println("Inserisci anno di nascita");
        int annoNascita = scan.nextInt();

        int totaleNascita = giornoNascita + meseNascita + annoNascita;


        System.out.println("La tua password sarà " + nome + "-" + cognome + "-" + colorePreferito + "-" + totaleNascita);
    }
}
