package Oggetti;

public class DadoExtends extends OggettoLancio
{
	
	public DadoExtends() { super(); }
	
	public String Lancio()
	{
		int lancio = (r.nextInt(6))+1;
		return "" +lancio;
	}

}
