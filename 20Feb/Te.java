
public class Te extends Bebida
{
	int costo;
	String descripcion = "Tizana";
	
	public Te(String size)
	{
		this.size = size;
		
	}
	
	public int costo()
	{
		if (size.equals("chico"))
		{
			costo = 25;
		}
		
		else if (size.equals("mediano"))
		{
			costo = 30;
		}
		
		else if(size.equals("grande"))
		{
			costo = 35;
		}
		return costo;
	}

	public String getDescripcion() 
	{
		return descripcion;
		
	}
}
