import java.util.Scanner;

import Oggetti.DadoExtends;
import Oggetti.MonetaExtends;
import Oggetti.OggettoLancio;

public class LancioExtends {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		int input;
		OggettoLancio oggetto;

		do 
		{
			do 
			{
				System.out.println("--- MENU ---");
				System.out.println("--- 1) Lancia una moneta");
				System.out.println("--- 2) lancia un dado");
				System.out.println("--- 0) ESCI");
				input = in.nextInt();
				if (input !=1 && input != 2 && input != 0) System.out.println("[Carattere non consentito]");
			} while(input !=1 && input != 2 && input != 0);
			
			switch(input)
			{
			case 1: 
				{
					oggetto = new MonetaExtends();
					oggetto.stampaLancio();
				}break;
			case 2:
				{
					oggetto = new DadoExtends();
					oggetto.stampaLancio();
				}break;
			case 0:return;
			}
		}while(true);


	}

}
