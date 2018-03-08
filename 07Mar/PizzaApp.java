
public class PizzaApp 
{
	public static void main (String []args)
	{		
		Pizza vegetariana = new Vegetariana();
		Pizza vegana = new Vegana();
		Pizza mexicana = new Mexicana();
		
		vegetariana.orderPizza(vegetariana);
		vegana.orderPizza(vegana);
		mexicana.orderPizza(mexicana);		
	}	
}
