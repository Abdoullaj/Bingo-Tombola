package Gioco;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tombola prova = new Tombola();
		//prova.stampaMatrice();
		//prova.stampaArray();

		
		GiocoPremi giochiamo = new GiocoPremi(3,'t');
		
		Estrazione pescaprima = new Estrazione();
		pescaprima.stampaArray();
		
		giochiamo.ricerca();
		
		
	}

}
