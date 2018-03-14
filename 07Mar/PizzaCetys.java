
public class PizzaCetys extends PizzaStore 
{
	@Override
	public Pizza pizzaMaker(String pizzaTipo) {
		// TODO Auto-generated method stub
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
