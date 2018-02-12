import java.util.*;

public class WeatherData extends Observable 
{
	float temperatura, presion, humedad, viento, probaLluvia;
	double visibilidad;
	
	public WeatherData()
	{
		
	}
	
	public float getTemperatura()
	{
		return this.temperatura;
	}
	
	public float getPresion()
	{
		return this.presion;
	}
	
	public float getHumedad ()
	{
		return this.humedad;
	}
	
	public float getViento()
	{
		return this.viento;
	}
	
	public double getVisibilidad()
	{	
		return this.visibilidad;
	}
	
	public float getProbaLluvia()
	{
		return this.probaLluvia;
	}
	
	public void setTemperatura(float temperatura)
	{
		this.temperatura = temperatura;
	}
	
	public void setPresion(float presion)
	{
		this.presion = presion;
	}
	
	public void setHumedad(float humedad)
	{
		this.humedad = humedad;
	}
	
	public void setViento(float viento)
	{
		this.viento = viento;
	}
	
	public void setProbaLluvia(float probaLluvia)
	{
		this.probaLluvia = probaLluvia;
	}
	
	public void setVisibilidad(double visibilidad)
	{
		this.visibilidad = visibilidad;
	}
	
	public void setMeasurements(float temperatura, float presion, float humedad, float viento, double visibilidad, float probaLluvia)
	{
		this.temperatura = temperatura;
		this.presion = presion;
		this.humedad = humedad;
		this.viento = viento;
		this.visibilidad = visibilidad;
		this.probaLluvia = probaLluvia;	
		measurementChanged();
	}
	
	public void measurementChanged() 
	{
		setChanged();
		notifyObservers(new WrapperWeatherClass(temperatura, presion, humedad, viento, probaLluvia, visibilidad));
	}
}
