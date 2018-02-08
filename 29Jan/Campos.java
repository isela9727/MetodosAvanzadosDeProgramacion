
public class Campos 
{
	Validar validacion;
	String value;
	
	public boolean validar(String validar)
	{
		return false;
	}
	
	public void setValidacion(Validar validar)
	{
		this.validacion = validar;
	}
	
	public boolean setValue(String value)
	{
		if(validar(value))
		{
			this.value = value;
			return true;
		}
		else
		{
			return false;
		}
	}
}
