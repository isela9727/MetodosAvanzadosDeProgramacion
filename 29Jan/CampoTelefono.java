
public class CampoTelefono implements Validar
{
	@Override
	public boolean validar(String validar) 
	{
		// TODO Auto-generated method stub
		if(validar.length() == 10 && validar.matches("[0-9]+"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

}
