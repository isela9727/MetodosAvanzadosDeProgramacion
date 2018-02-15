import java.sql.*;
import java.util.*;

public class PaqueteriaData extends Observable
{ 
	UUID idPaquete;
	String ciudad, compania;
	Timestamp ultimaActualizacion;

	public PaqueteriaData(String ciudad, Timestamp ultimaActualizacion)
	{
		this.idPaquete = UUID.randomUUID();
		this.ciudad = ciudad;
		this.ultimaActualizacion = ultimaActualizacion;
	}
	
	public UUID getIdPaquete()
	{
		return this.idPaquete;
	}
	
	public String getCiudad()
	{
		return this.ciudad;
	}
	
	public String getCompania()
	{
		return this.compania;
	}
	
	public Timestamp getUltimaUbicacion()
	{
		return this.ultimaActualizacion;
	}
	
	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
		this.ultimaActualizacion.setTime(System.currentTimeMillis());
	}
	
	public void setInformacion(UUID idPaquete, String ciudad)
	{
		this.idPaquete = idPaquete;
		this.ciudad = ciudad;
		envioChanged();
	}
	
	public void envioChanged()
	{
		setChanged();
		notifyObservers();
	}	
}
