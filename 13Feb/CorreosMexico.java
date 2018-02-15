import java.util.*;

public class CorreosMexico implements MostrarInformacion
{
	int idPaquete;
	String ciudad;
	
	public CorreosMexico(Observable paqueteriaData)
	{
		paqueteriaData.addObserver((Observer) this);
	}
	
	public void update(Object arg)
	{
		WrapperPaqueteria wrapper = (WrapperPaqueteria) arg;
		this.idPaquete = wrapper.getIdPaquete();
		this.ciudad = wrapper.getCiudad();
		display();
	}
	
	
	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("El paquete: " + idPaquete + "de la compania Correos de Mexico, se encuentra en: " + ciudad); 
	}

}

