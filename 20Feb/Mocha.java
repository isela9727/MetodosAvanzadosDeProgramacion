
public class Mocha extends Extras
{
	Bebida bebida;
	int costo = 5;
	String descripcion = "Mocha";
	
	public Mocha (Bebida bebida)
	{
		this.bebida = bebida;
	}
	
	public int costo()
	{
		return costo + bebida.costo();
	}

	@Override
	public String getDescripcion() 
	{
		// TODO Auto-generated method stub
		return bebida.getDescripcion() + ", " + descripcion;
	}
}
