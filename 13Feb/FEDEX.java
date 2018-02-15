import java.util.*;

public class FEDEX implements MostrarInformacion
{
	int idPaquete;
	String ciudad;
	
	public FEDEX(Observable paqueteriaData)
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
		System.out.println("El paquete: " + idPaquete + "de la compania FEDEX, se encuentra en: " + ciudad); 
	}

}

