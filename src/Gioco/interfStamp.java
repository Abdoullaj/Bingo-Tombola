package Gioco;

public interface interfStamp {
	
	public default void stampaMatrice(int [][] tabella) {
		for(int i = 0; i < tabella.length; i++) {
			for(int j = 0; j < tabella[i].length; j++) {	
				System.out.print(tabella[i][j] + "  ");
			} 
			System.out.println("\n ");
		}
	}
		public default void stampaTutto (Giocatori [] giocatori, Estrazione arbitro) {
			
			for(int m= 0; m < y.length ; m++) {
				for(int i = 0; i< giocatori.length; i++) {
				
					for(int j = 0; j < giocatori[i].numeroCartelle; j++) {
					int [] [] matrice =  giocatori[i].getListaCartella()[j].getTabella();
					 	for(int k = 0; k <matrice.length; k++ ) {
					 		for(int l =0; l < matrice[k].length; l++) {
							 int x = matrice[k][l];
								 if( x == y[m]) {
									 matrice[k][l] = -1;
							 }
						 }
					 	
					 }
					
				}
				}
			}
	}
}
