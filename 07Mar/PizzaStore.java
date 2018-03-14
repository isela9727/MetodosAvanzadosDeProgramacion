
public abstract class PizzaStore 
{
	Pizza pizza;
	public Pizza orderPizza(String pizzaTipo)
	{
		pizza = pizzaMaker(pizzaTipo);
		pizza.preparar();
		pizza.hornear();
		pizza.empacar();
		pizza.cortar();
		pizza.enviar();
		return pizza;
	}
	
	public abstract Pizza pizzaMaker(String pizzaTipo);
}
