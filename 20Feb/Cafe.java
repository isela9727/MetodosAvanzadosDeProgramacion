
public class Cafe extends Bebida
{
	int costo;
	String descripcion = "Cafe";
	
	public Cafe(String size)
	{
		this.size = size;
		
	}
	
	public int costo()
	{
		if (size.equals("chico"))
		{
			costo = 35;
		}
		
		else if (size.equals("mediano"))
		{
			costo = 40;
		}
		
		else if(size.equals("grande"))
		{
			costo = 45;
		}
		return costo;
	}

	public String getDescripcion() 
	{
		return descripcion;
		
	}
}
