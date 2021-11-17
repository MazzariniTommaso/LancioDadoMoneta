package Oggetti;

import java.util.Random;

public abstract class OggettoLancio 
{
	public Random r = new Random();
	private String lancio = Lancio();
	
	public OggettoLancio() { }
	
	public void stampaLancio()
	{
		System.out.println(lancio);
	}
	
	public abstract String Lancio();

}
