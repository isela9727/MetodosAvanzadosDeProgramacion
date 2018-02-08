
public class CampoWeb implements Validar
{

	@Override
	public boolean validar(String validar) 
	{
		// TODO Auto-generated method stub
		if(validar.startsWith("https://") || validar.startsWith("http://") || validar.startsWith("www.") && validar.endsWith(".com") || validar.endsWith(".gob"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
