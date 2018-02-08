
public class Email extends Campos
{
	public Email()
	{
		setValidacion(new CampoEmail());
	}
	
	public Email (Validar validar)
	{
		setValidacion(validar);
	}
	@Override
	public boolean validar(String validar)
	{
		return validacion.validar(validar);
	}
}
