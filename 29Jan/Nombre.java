
public class Nombre extends Campos
{
	public Nombre()
	{
		setValidacion(new CampoNombre());
	}
	
	public Nombre (Validar validar)
	{
		setValidacion(validar);
	}
	@Override
	public boolean validar(String validar)
	{
		return validacion.validar(validar);
	}
}
