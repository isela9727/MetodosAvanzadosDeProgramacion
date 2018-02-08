
public class Contrasena extends Campos
{
	public Contrasena()
	{
		setValidacion(new CampoContrasena());
	}
	
	public Contrasena (Validar validar)
	{
		setValidacion(validar);
	}
	@Override
	public boolean validar(String validar)
	{
		return validacion.validar(validar);
	}
}
