
public class PizzaApp 
{
	public static void main (String []args)
	{		
		PizzaFactory pizzaFactory = new PizzaFactory();
		
		Pizza isela = pizzaFactory.orderPizza("vegetariana");
		isela.pizzaMaker();
		
		Pizza cristian = pizzaFactory.orderPizza("mexicana");
		cristian.pizzaMaker();
		
		Pizza melissa = pizzaFactory.orderPizza("vegana");
		melissa.pizzaMaker();
	}	
}
