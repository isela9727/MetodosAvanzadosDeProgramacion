import java.util.*;

public class WrapperPaqueteria implements Observer, MostrarInformacion
{
	int idPaquete;
	String ciudad;
	
	public WrapperPaqueteria(String compania)
	{
	}
	
	public int getIdPaquete()
	{
		return this.idPaquete;
	}
	
	public String getCiudad()
	{
		return this.ciudad;
	}
	
	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
