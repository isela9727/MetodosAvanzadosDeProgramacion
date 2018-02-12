import java.util.Observable;
import java.util.Observer;

public class DisplayB implements Observer, Displayable
{
	float temperatura, humedad, presion;
	
	public DisplayB(Observable weatherData)
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
			this.presion = wrapper.getPresion();
			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("DISPLAY B\n");
		System.out.print("La temperatura de hoy es: " + temperatura + "C \n");
		System.out.println("La presion de hoy es: " + presion + "hPa ");
		System.out.println("La humedad de hoy es: " + humedad + "% ");
	}
}

