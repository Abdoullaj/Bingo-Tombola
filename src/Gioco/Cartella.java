package Gioco;

import java.util.Random;

public abstract class Cartella {
	int [] [] tabella;
	int [] controllo; 
	
	
	public Cartella(int base, int altezza) {
		tabella = new int [base][altezza];
		controllo = new int [tabella.length * tabella[0].length];
		controllo[0] =  0;
		riempiCartella();
	}
	
	
	public void riempiCartella() {
		int conter = 0;
		for(int i = 0; i < tabella.length; i++) {
			for(int j = 0; j < tabella[i].length; j++) {				
				tabella[i][j] = controlloRandom(conter);
				conter++;
				System.out.println("Inserito nella tabella ok???????????????");
			}
			System.out.println("Fine riga");
		}
	}
	
	
	///IL PROBLEMA E NEL CONTER
	public int controlloRandom(int conter) {
		Random random = new Random();
		int num = 0;
		for(int i = 0; i <= conter; i++) {			
			num= random.nextInt(89) +1;
			for(int j=0; j< controllo.length; j++) {
				while(num == controllo[j] ) {
					num= random.nextInt(89) +1;
					System.out.println("il numero è gia uscito: " + num + "posizione array j : " + j +"primo for : " + i);
				}
			}
		}
			controllo[conter + 1] = num;
			conter ++;
			System.out.println("attuale numeri  : " + num);
			return num;
	}
	
	public void stampaMatrice() {
		for(int i = 0; i < tabella.length; i++) {
			for(int j = 0; j < tabella[i].length; j++) {	
				System.out.print(tabella[i][j] + "  ");
			} 
			System.out.println("\n ");
		}
	}
	
	
	public void stampaArray() {
		for(int i = 0; i<controllo.length; i++) {
			System.out.print(controllo[i] + "  ");
			
		}
	}


	/*public int mettiReal(int conter) {
		
		Random random = new Random();
		int x = random.nextInt(89)+1;
		for (int i = 1; i <= conter; i++) {
			if(x == controllo[i-1]) {
				System.out.println("Il numero "+x+"è stato trovato due volte.");
				i = 0;
				x = random.nextInt(89)+1;
			}
		}
		if (conter < controllo.length)
			controllo[conter] = x;
		System.out.println("inserito:  " + x);
		return x;
	} */
}