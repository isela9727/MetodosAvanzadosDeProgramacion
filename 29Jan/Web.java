
public class Web extends Campos
{
	public Web()
	{
		setValidacion(new CampoWeb());
	}
	
	public Web (Validar validar)
	{
		setValidacion(validar);
	}
	@Override
	public boolean validar(String validar)
	{
		return validacion.validar(validar);
	}
}
