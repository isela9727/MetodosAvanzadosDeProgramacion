
public class GarageDoor
{
	Close garageClose;
	Open garageOpen;
	TurnLights garageTurnLight;
	
	public void open()
	{
		System.out.println("Puerta de Garage Abierta");
	}
	
	public void close()
	{
		System.out.println("Puerta de Garage Cerrada");
	}
	
	public void turnLights()
	{
		System.out.println("Luces encendidas de la puerta del garage");
	}
}
