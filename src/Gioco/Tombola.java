package Gioco;

public class Tombola extends Cartella{

	public static int altezzaCart = 3;
	public static int baseCart = 5;
	public static double costo = 0.5;
	public static int montepremi= 0;
	public double ambo, terna , quaterna, cinquina, tombola;
	
	public Tombola() {
		super(altezzaCart, baseCart);
		montepremi += costo;
	}
	
	public void premi() {
		tombola = montepremi*0.66;
		montepremi -= tombola;
		cinquina = montepremi*0.50;
		montepremi -= cinquina;
		quaterna = montepremi*0.33;
		terna = montepremi*0.33;
		ambo = montepremi*0.33;
	}
}
