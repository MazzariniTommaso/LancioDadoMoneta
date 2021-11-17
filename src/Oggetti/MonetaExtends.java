package Oggetti;

public class MonetaExtends extends OggettoLancio
{
	public MonetaExtends() { super(); }
	
	public String Lancio()
	{
		int numero = r.nextInt(2);
		switch(numero) {
		case 0 : 
			{
			return "testa";
			}
		case 1 : 
			{
			return "croce";
			}
		}
		return "error";
	}

}
