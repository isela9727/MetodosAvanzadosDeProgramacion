
public class WrapperWeatherClass 
{
	float temperatura, presion, humedad, viento, probaLluvia;
	double visibilidad;
	
	public WrapperWeatherClass(float temperatura, float presion, float humedad, float viento, float probaLluvia, double visibilidad)
	{
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.presion = presion;
		this.viento = viento;
		this.probaLluvia = probaLluvia;
		this.visibilidad = visibilidad;		
	}
	
	public float getTemperatura()
	{
		return this.temperatura;
	}
	
	public float getHumedad()
	{
		return this.humedad;
	}
	
	public float getViento()
	{
		return this.viento;
	}
	
	public float getPresion()
	{
		return this.presion;
	}
	
	public float getProbaLluvia()
	{
		return this.probaLluvia;
	}
	
	public double getVisibilidad()
	{
		return this.visibilidad;
	}
}
