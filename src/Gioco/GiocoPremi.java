package Gioco;

public class GiocoPremi {
	Giocatori [] giocatori;
	Estrazione arbitro = new Estrazione() ;
	boolean ambo = false;
	boolean terna = false;
	boolean quaterna = false;
	boolean cinquina = false;
	boolean amboG = false;
	boolean ternaG = false;
	boolean quaternaG = false;
	boolean cinquinaG = false;
	boolean vincita = false;
	boolean vincitaG = false; 

	
	public GiocoPremi(int numeroPartecipanti, char gioco) {
		giocatori = new Giocatori[numeroPartecipanti];
		creaGiocatori(gioco);
	}
	
	public void creaGiocatori(char gioco) {
		for(int i = 0; i<giocatori.length; i++) {
			Giocatori x = new Giocatori(gioco);
			giocatori[i] = x;
		}
	}
	
	public void ricerca() {
		int [] y = arbitro.getTabellone();
		for(int m= 0; m < y.length ; m++) {
		
			for(int i = 0; i< giocatori.length; i++) {
			//System.out.println("giocatore numero: " + i);
			//Giocatori x = giocatori[i];
			
				for(int j = 0; j < giocatori[i].numeroCartelle; j++) {
				//System.out.println("giocatore numero: " + i+ "cartella numero : " +j);
				int [] [] matrice =  giocatori[i].getListaCartella()[j].getTabella();
				 	for(int k = 0; k <matrice.length; k++ ) {
				 		for(int l =0; l < matrice[k].length; l++) {
						 int x = matrice[k][l];
						 //int [] y = arbitro.getTabellone();
						//(int m= 0; m < y.length ; m++) {
							 if( x == y[m]) {
								 matrice[k][l] = -1;
								 //System.out.println("Numero sostituito");
							 } 
						 }
				 		 assegnaPremi(matrice, k);
				 		tombola(matrice);
					 }
				 	
				 }
				
			}
			checkPremi();
			if(vincitaG) {
				break;
			}
		}
		
	}
	
	public void assegnaPremi(int [] [] matrice, int riga) {
		int cont = 0;
		for(int l =0; l < matrice[riga].length; l++) {
			if(matrice[riga][l] == -1) {
				cont ++;
			}
		}	
			switch (cont) {
				case 2:
					if(!ambo || !amboG) {
						System.out.println("AMBO");
						ambo = true;
					}
					break;

				case 3:
					if(!terna || !ternaG) {
						System.out.println("TERNA");
						terna = true;
					}
					break;

				case 4:
					if(!quaterna || !quaternaG) {
						System.out.println("QUATERNA");
						quaterna = true;
					}
					break;

				case 5:
					if(!cinquina || !cinquinaG) {
						System.out.println("CINQUINA");
						cinquina = true;
					}
					break;
		 }
	}
	
	public void checkPremi() {
		if(ambo) {
			amboG = true;
		}
		if(terna) {
			ternaG = true;
		}
		if(quaterna) {
			quaternaG = true;
		}
		if(cinquina) {
			cinquinaG = true;
		}
	}
	
	public void tombola(int [] [] matrice) {
		int cont = 0;
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++){
				if(matrice[i][j] != -1) {
					cont ++;
				}	
			}
		}
		if(cont == 0) {
			vincita = true;
			System.out.println("TOMBOLA");
		}
		
	}
	
	public void checkTombola() {
		if(vincita) {
			vincitaG = true;
		}
	}
	
}
