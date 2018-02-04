package Gioco;

public class  Bingo extends Cartella{

	public static int altezzaCart = 3;
	public static int baseCart = 10; 
	public static int costo = 1;
	static int montepremi= 0;
	public double cinquina, tombola;
	
	public Bingo() {
		super(altezzaCart, baseCart);
		montepremi += costo;
	}

}
