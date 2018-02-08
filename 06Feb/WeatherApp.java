
public class WeatherApp 
{
	public static void main (String[] args)
	{
		WeatherData weatherDataStation = new WeatherData();
		weatherDataStation.setTemperatura(27);
		weatherDataStation.setPresion(1023);
		weatherDataStation.setHumedad(62);
		weatherDataStation.setViento(6);
		weatherDataStation.setVisibilidad(11.3);
		weatherDataStation.setProbaLluvia(0);
		
		DisplayA displayA = new DisplayA();
		DisplayB displayB = new DisplayB();
		DisplayC displayC = new DisplayC();
		
		weatherDataStation.registrarSuscriptor(displayA);
		weatherDataStation.registrarSuscriptor(displayB);
		weatherDataStation.registrarSuscriptor(displayC);
		
		
		weatherDataStation.notificarSuscriptor();
		displayA.display();
		displayB.display();
		
		weatherDataStation.borrarSuscriptor(displayC);
	}
}
