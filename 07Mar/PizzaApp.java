
public class PizzaApp 
{
	public static void main (String []args)
	{		
		PizzaStore pizzaPlayas = new PizzaPlayas();
		PizzaStore pizzaCetys = new PizzaCetys();
		
		pizzaPlayas.orderPizza("vegetariana");
		
		pizzaCetys.orderPizza("mexicana");
		
		pizzaCetys.orderPizza("vegana");
	}	
}
