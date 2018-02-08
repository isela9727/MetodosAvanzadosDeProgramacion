
public class DisplayB implements WeatherSuscriptor, Displayable
{
	float temperatura, humedad, viento, presion, probaLluvia;
	double visibilidad;
	
	@Override
	public void actualizar(float temperatura, float presion, float humedad, float viento, double visibilidad, float probaLluvia) 
	{
		// TODO Auto-generated method stub
		this.temperatura = temperatura;
		this.presion = presion;
		this.humedad = humedad;
		this.viento = viento;
		this.visibilidad = visibilidad;
		this.probaLluvia = probaLluvia;	
	}
	
	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.print("DISPLAY B\n");
		System.out.print("La temperatura de hoy es: " + temperatura + "C \n");
		System.out.println("La presion de hoy es: " + presion + "hPa ");
		System.out.println("La humedad de hoy es: " + humedad + "% \n");
	}
}
