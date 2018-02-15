import java.util.*;

public class PaqueteriaApp 
{
	public static void main (String[] args)
	{
		List<String> ciudades = new ArrayList<String>();
		ciudades.add("Mexicali");
		ciudades.add("Tijuana");
		ciudades.add("Ensenada");
		ciudades.add("Tecate");
		ciudades.add("Rosarito");
		
		List<Integer> paquetes = new ArrayList<Integer>();
		paquetes.add(1234);
		paquetes.add(2345);
		paquetes.add(3456);
		paquetes.add(4567);
		paquetes.add(5678);
		paquetes.add(6789);
		paquetes.add(7890);
		
		@SuppressWarnings("resource")
		Scanner scannerId = new Scanner(System.in);
		System.out.println("Ingresa el id del paquete: ");
		String id = scannerId.next();
		Integer idPaquete = Integer.parseInt(id);
		if (paquetes.contains(idPaquete))
		{
			System.out.println("Buscando el paquete...");
		}
		else
		{
			System.out.println("El paquete ingresado no existe.");
		}	
		PaqueteriaData paqueteriaDataStation = new PaqueteriaData(id, null);
		paqueteriaDataStation.setInformacion(idPaquete, ciudades.get(0));
		
		DHL dhl = new DHL(paqueteriaDataStation);
		FEDEX fedex = new FEDEX(paqueteriaDataStation);
		CorreosMexico correosMexico = new CorreosMexico(paqueteriaDataStation);
				
		paqueteriaDataStation.envioChanged();
	}
}
