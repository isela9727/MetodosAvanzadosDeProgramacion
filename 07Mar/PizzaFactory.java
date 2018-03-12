
public class PizzaFactory 
{
	public Pizza orderPizza(String pizzaTipo)
	{
		if (pizzaTipo == null)
		{
			return null;
		}
		
		if (pizzaTipo.equalsIgnoreCase("vegetariana"))
		{
			return new Vegetariana();
		}
		
		else if (pizzaTipo.equalsIgnoreCase("vegana"))
		{
			return new Vegana();
		}
		
		else if (pizzaTipo.equalsIgnoreCase("mexicana"))
		{
			return new Mexicana();
		}
		
		return null;
	}
}
