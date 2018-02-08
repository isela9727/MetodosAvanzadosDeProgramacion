
public class CampoContrasena implements Validar
{
	@Override
	public boolean validar(String validar) 
	{
		// TODO Auto-generated method stub
		if(validar.contains("!") || validar.contains(".") || validar.contains("?") || validar.contains("*"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

}
