
public class WeatherApp 
{
	public static void main (String[] args)
	{
		WeatherData weatherDataStation = new WeatherData();
		weatherDataStation.setMeasurements(27, 1023, 62, 6, 11.3, 0);
		
		DisplayA displayA = new DisplayA(weatherDataStation);
		DisplayB displayB = new DisplayB(weatherDataStation);
		DisplayC displayC = new DisplayC(weatherDataStation);
				
		weatherDataStation.measurementChanged();
	}
}
