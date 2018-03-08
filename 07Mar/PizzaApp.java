
public class PizzaApp 
{
	public static void main (String []args)
	{
		Pizza vegetariana = new Vegetariana();
		Pizza vegana = new Vegana();
		Pizza mexicana = new Mexicana();
		
		vegetariana.preparar();
		vegetariana.hornear();
		vegetariana.cortar();
		vegetariana.empacar();
		vegetariana.enviar();
		
		vegana.preparar();
		vegana.hornear();
		vegana.cortar();
		vegana.empacar();
		vegana.enviar();
		
		mexicana.preparar();
		mexicana.hornear();
		mexicana.cortar();
		mexicana.empacar();
		mexicana.enviar();
		//vegetariana = PizzaMaker("pizza");
	}	
}
