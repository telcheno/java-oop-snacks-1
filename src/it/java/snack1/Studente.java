package it.java.snack1;

public class Studente {
	//creo le variabili per asegnare i dati dello studente
	protected String nome;
	protected String cognome;
	protected int  anni;
	
	//creo il metodo costruttore dello studente incapsulando i parametri
	protected void getStudente(String nome , String cognome, int anni ) {
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
	}
	
	//creo il metodo che retorna lo studente con tutti i dati 
	protected  String  getStudenteCreato(Studente input) {
		return "Studente: " +  this.nome +" " + this.cognome + ", " + this.anni + " anni.";
		
	}
	
	
}
