
public class Telefono extends Campos
{
	public Telefono()
	{
		setValidacion(new CampoTelefono());
	}
	
	public Telefono (Validar validar)
	{
		setValidacion(validar);
	}
	@Override
	public boolean validar(String validar)
	{
		return validacion.validar(validar);
	}
}
