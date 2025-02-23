/*
 * esercizio di oggi è un (insicurissimo) Password Generator
nome del repo: java-password-generator
Create un nuovo progetto java chiamato java-password-generator
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
- chiedere all'utente e salvare in opportune variabili il
	- nome
	- cognome
	- colore preferito
	- data di nascita di un utente suddivisa in giorno, mese e anno in numero
- generare (e stampare a video) una password concatenando nome, cognome, colore preferito e 
somma di giorno, mese e anno di nascita, separate dal carattere -
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito 
è il magenta
La sua password sarà Pinco-Pallo-magenta-2011
 */

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // scan del nome

        System.out.println("Inserisci il tuo nome");
        String nome = scan.nextLine();

        // scan del conome

        System.out.println("Inserisci il tuo cognome");
        String cognome = scan.nextLine();

        // scan del colore preferito

        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = scan.nextLine();

        // scan del giorno di nascita

        System.out.println("Inserisci il giorno della tua data di nascita");
        int giornoNascita = scan.nextInt();

        // scan del mese di nascita
        
        System.out.println("Inserisci il mese della tua data di nascita");
        int meseNascita = scan.nextInt();

        // scan dell'anno di nascita

        System.out.println("Inserisci anno di nascita");
        int annoNascita = scan.nextInt();

        //variabile per la somma dei valori della data di nascita

        int totaleNascita = giornoNascita + meseNascita + annoNascita;

        //stampo la password
        
        System.out.println("La tua password sarà " + nome + "-" + cognome + "-" + colorePreferito + "-" + totaleNascita);
    }
}
