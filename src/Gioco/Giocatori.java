package Gioco;

public class Giocatori {
	Cartella [] listaCartella = new Cartella [5];
	int numeroCartelle =0;
	char gioco;
	
	public void compraCartella() {
		switch(gioco) {
		case 't':
			creaCartellaTombola();
			break;
		case 'b':
			creaCartellaBingo();
			break;
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
