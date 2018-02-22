
public class Crema extends Extras
{
	Bebida bebida;
	int costo = 10;
	String descripcion = "Crema";
	
	public Crema (Bebida bebida)
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
