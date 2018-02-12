import java.util.*;

public class DisplayA implements Observer, Displayable
{
	float temperatura, humedad, viento, presion, probaLluvia;
	double visibilidad;
	
	public DisplayA(Observable weatherData)
	{
		weatherData.addObserver(this);
	}
	
	public void update(Observable observable, Object arg)
	{
		if (observable instanceof WeatherData)
		{
			WeatherData weather = (WeatherData) observable;
			WrapperWeatherClass wrapper = (WrapperWeatherClass) arg;
			this.temperatura = wrapper.getTemperatura();
			this.humedad = wrapper.getHumedad();
			this.viento = wrapper.getViento();
			this.presion = wrapper.getPresion();
			this.probaLluvia = wrapper.getProbaLluvia();
			this.visibilidad = wrapper.getVisibilidad();
			display();
		}
	}
	
//	@Override
//	public void actualizar(float temperatura, float presion, float humedad, float viento, double visibilidad, float probaLluvia)
//	{	
//		this.temperatura = temperatura;
//		this.humedad = humedad;
//		this.presion = presion;
//		this.viento = viento;
//		this.probaLluvia = probaLluvia;
//		this.visibilidad = visibilidad;
//		display();
//	}

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
