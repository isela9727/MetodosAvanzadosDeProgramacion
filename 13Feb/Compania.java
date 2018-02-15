import java.sql.*;
import java.util.*;
public class Compania extends Observable
{
	String compania;
	Timestamp actualizacion;
	ArrayList<PaqueteriaData> paquetes = new ArrayList<PaqueteriaData>();
	ArrayList<PaqueteriaData> paquetesActualizados = new ArrayList<PaqueteriaData>();
	
	public Compania(String compania, Timestamp actualizacion)
	{
		this.compania = compania;
		this.actualizacion = actualizacion;
	}
	
	public PaqueteriaData newPaquete(String ciudad)
	{
		PaqueteriaData paqueteria = new PaqueteriaData(ciudad, this.actualizacion);
		paquetes.add(paqueteria);
		return paqueteria;
	}
	
	public void updatePaquete(PaqueteriaData paqueteria, String ciudad)
	{
	
	}
	
	public void notification()
	{
		notifyObservers(paquetesActualizados);
		paquetesActualizados = new ArrayList<PaqueteriaData>();
	}
	
	public String getCompania()
	{
		return this.compania;
	}
}
