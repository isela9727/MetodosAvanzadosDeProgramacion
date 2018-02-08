import java.util.*;

public class WeatherData implements Sujeto 
{
	List<WeatherSuscriptor> suscriptores = new ArrayList<WeatherSuscriptor>();
	float temperatura, presion, humedad, viento, probaLluvia;
	double visibilidad;

	public void setTemperatura(float temperatura)
	{
		this.temperatura = temperatura;
	}
	
	public void setPresion(float presion)
	{
		this.presion = presion;
	}
	
	public void setHumedad (float humedad)
	{
		this.humedad = humedad;
	}
	
	public void setViento(float viento)
	{
		this.viento = viento;
	}
	
	public void setVisibilidad(double visibilidad)
	{
		this.visibilidad = visibilidad;
	}
	
	public void setProbaLluvia(float probaLluvia)
	{
		this.probaLluvia = probaLluvia;
	}
	

	@Override
	public void registrarSuscriptor(WeatherSuscriptor suscriptor) 
	{
		// TODO Auto-generated method stub
		suscriptores.add(suscriptor);
	}

	@Override
	public void borrarSuscriptor(WeatherSuscriptor suscriptor) 
	{
		// TODO Auto-generated method stub
		suscriptores.remove(suscriptor);
	}

	@Override
	public void notificarSuscriptor() 
	{
		// TODO Auto-generated method stub
		for (WeatherSuscriptor weatherSuscriptores : suscriptores)
		{
			weatherSuscriptores.actualizar(temperatura, presion, humedad, viento, visibilidad, probaLluvia);
		}
	}
	
	public void measurementChanged() 
	{
		notificarSuscriptor();
	}
}
