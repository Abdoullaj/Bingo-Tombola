package Gioco;

public class Giocatori {
	Cartella [] listaCartella = new Cartella [5];
	int numeroCartelle = 0 ;
	char gioco;
	
	public Giocatori(char gioco) {
		
		this.gioco = gioco;
		compraCartella();
		
	}
	
	public Cartella [] getListaCartella() {
		return listaCartella;
	}
	
	public void compraCartella() {
		switch(gioco) {
		case 't':
			creaCartellaTombola();
			break;
		case 'b':
			creaCartellaBingo();
			break;
			default :
				System.out.println("Specificare gioco");
		}
	}
	
	public void creaCartellaTombola() {
		Tombola singolaCartella = new Tombola();
		listaCartella[numeroCartelle] = singolaCartella;
		this.numeroCartelle ++;
	}
	
	public void creaCartellaBingo() {
		Bingo singolaCartella = new Bingo();
		listaCartella[numeroCartelle] = singolaCartella;
		this.numeroCartelle ++;
	}
	
	

}
