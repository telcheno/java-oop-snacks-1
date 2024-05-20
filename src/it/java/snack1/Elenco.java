package it.java.snack1;

public class Elenco {
	
	private Studente[] elenco;
	
	protected int indiceArray = 0;
	
	public Elenco() {
		this.elenco = new Studente[3];
		}
	
	public void AgiungeStudente(Studente input) {
		if(indiceArray < elenco.length) {
			this.elenco[indiceArray] = input;
			indiceArray ++;	
		}else {
			System.out.println("I'elenco è pieno lo studente " );
		}
	}
	
	public void stampaElanco() {
		for(int i = 0; i < elenco.length; i++) {
			if(elenco[i] != null) {
				System.out.println(elenco[i].getStudenteCreato(null));
				
			}
		}
	}
}
