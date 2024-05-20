/*Crea una classe RegistroStudenti che rappresenti un registro di studenti.
Utilizza un array privato per memorizzare oggetti Studente.  Implementa un costruttore senza parametri per
inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
Aggiungi un metodo che stampi la lista degli studenti. 
 * */

package it.java.snack1;

import java.util.Scanner;

public class RegistroStudenti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Compila i tuoi dati per partecipare \n");
		System.out.println("Inserisce il dati dello studente \n");
		
//		Stanzio studente per inserire i dati degli studenti
		Studente studente1 = new Studente();
//		studente1.nome = input.nextLine();
//		studente1.cognome = input.nextLine();
//		studente1.anni = input.nextInt();
		
		studente1.getStudente("Telmo", "Checa", 50);
		
		Studente studente2 = new Studente();
//		studente2.nome = input.nextLine();
//		studente2.cognome = input.nextLine();
//		studente2.anni = input.nextInt();

		studente2.getStudente("Diego", "Checa", 12);
		
		Studente studente3 = new Studente();
//		studente3.nome = input.nextLine();
//		studente3.cognome = input.nextLine();
//		studente3.anni = input.nextInt();

		studente3.getStudente("Veronica", "Olivares", 50);
		Studente studente4 = new Studente();
		studente4.getStudente("Lolli", "Checa", 4);
		
		
		
//		Stampo lo studente creato
//		System.out.println(studente.getStudenteCreato());
		
//		Stanzip l'elenco degli studenti
		Elenco elenco = new Elenco();

//		System.out.println(elenco);
		elenco.AgiungeStudente(studente1);
		elenco.AgiungeStudente(studente2);
		elenco.AgiungeStudente(studente3);
		elenco.AgiungeStudente(studente4);
//		
		elenco.stampaElanco();
	}
}		
	
	
		
		

