
public class CampoEmail implements Validar
{

	@Override
	public boolean validar(String validar) 
	{
		// TODO Auto-generated method stub
		if(validar.endsWith("@cetys.edu.mx"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
