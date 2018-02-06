package Gioco;

import java.util.Random;

public class Estrazione {
	int [] tabellone = new int [90];
	int [] pesca = new int [90];
	
	public Estrazione() {
		// TODO Auto-generated constructor stub
		pesca[0] =  0;
		riempiTabellone();
	}
	
	public int [] getTabellone() {
		return tabellone;
	}
	
	public void riempiTabellone() {
		int conter = 0;
		for(int i = 0; i < tabellone.length; i++) {				
				tabellone[i] = estraiNumero(conter);
				conter++;
		}
	}
	
	public int estraiNumero(int conter) {
		
		Random random = new Random();
		int x = random.nextInt(90)+1;
		for (int i = 1; i <= conter; i++) {
			if(x == pesca[i-1]) {
				//System.out.println("Il numero "+x+"è stato trovato due volte.");
				i = 0;
				x = random.nextInt(90)+1;
			}
		}
		if (conter < pesca.length)
			pesca[conter] = x;
		//System.out.println("inserito:  " + x);
		return x;
	} 
	
	public void stampaArray() {
		for(int i = 0; i<tabellone.length; i++) {
			System.out.print(tabellone[i] + " ");
			
		}
		//System.out.println("");
		
		//System.out.println("la lunghezza dell'arrayy" + tabellone.length);
		for(int i = 0; i< pesca.length; i++) {
		//	System.out.print(pesca[i] + " ");
			
		}
	}

}
