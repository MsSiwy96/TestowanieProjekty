package testyJUnit.domain;

public class Liczby {

	public int a;
	public int b;
	public String napis = null;
	
	public boolean czyAWieksze(int a, int b)
	{
		if(a > b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int dodawanie(int a, int b)
	{
		return a+b;
	}
	
	public String dajNapis()
	{
		return napis;
	}
	
	public String ustawNapis(String nap)
	{
		this.napis = nap;
		
		return napis;
	}
	
}
