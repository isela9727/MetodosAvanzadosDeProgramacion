
public class CampoNombre implements Validar
{
	@Override
	public boolean validar(String validar)
	{
		// TODO Auto-generated method stub
		if(validar.matches("[a-zA-Z]+"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
