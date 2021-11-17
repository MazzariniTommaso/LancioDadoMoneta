package Oggetti;
import java.util.Random;

public class Dado 
{
	private Random numeroRand = new Random();
	//private int numero;
	
	public Dado() { }
	
	public void lancioDado()
	{
		//numero = (int)(Math.random()* 5.1)+1;
		int numero = (numeroRand.nextInt(6))+1;
		if (numero == 0) numero++;
		System.out.println(numero);
	}

}