
public class Expresso extends Extras
{
	Bebida bebida;
	int costo = 10;
	String descripcion = "Expresso";
	
	public Expresso (Bebida bebida)
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
