
public class DisplayA implements WeatherSuscriptor, Displayable
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
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("DISPLAY A\n");
		System.out.print("La temperatura de hoy es: " + temperatura + "C \n");
		System.out.println("La presion de hoy es: " + presion + "hPa ");
		System.out.println("La humedad de hoy es: " + humedad + "% ");
		System.out.println("La velocidad del viento de hoy es: N" + viento + "km/h ");
		System.out.println("La visibilidad de hoy es: " + visibilidad + "km ");
		System.out.println("La probabilidad de lluvia de hoy es: " + probaLluvia + "% \n");
		
	}
}
