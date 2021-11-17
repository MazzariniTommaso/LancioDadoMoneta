import java.util.*;
import Oggetti.*;

public class Lancio {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		int input;
		Dado d = new Dado();
		Moneta m = new Moneta(); 
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
			case 1: m.lancioMoneta();break;
			case 2: d.lancioDado();break;
			case 0:return;
			}
		}while(true);

	}

}
