package Oggetti;
import java.util.*;

public class Moneta 
{
	private Random numeroRandom = new Random();
	private String valore;
	
	public Moneta() {
		super();
	}
	public void lancioMoneta() {
		System.out.println(GeneratoreNumeroCauale());
	}
	
	public String GeneratoreNumeroCauale() {
		int numero = numeroRandom.nextInt(2);
			switch(numero) {
			case 0 : {
				valore = "testa";
				break;
			}
			case 1 : {
				valore = "croce";
				break;
			}
			}
		return valore;
	}
	
	public Random getNumeroRandom() {
		return numeroRandom;
	}

	public void setNumeroRandom(Random numeroRandom) {
		this.numeroRandom = numeroRandom;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

}
