import java.util.Observable;
import java.util.Observer;

public class DisplayC implements Observer, Displayable
{
	float temperatura;
	
	public DisplayC(Observable weatherData)
	{
		weatherData.addObserver(this);
	}
	
	public void update(Observable observable, Object arg)
	{
		if (observable instanceof WeatherData)
		{
			WrapperWeatherClass wrapper = (WrapperWeatherClass) arg;
			this.temperatura = wrapper.getTemperatura();
			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("DISPLAY C\n");
		System.out.print("La temperatura de hoy es: " + temperatura + "C \n");
	}
}


