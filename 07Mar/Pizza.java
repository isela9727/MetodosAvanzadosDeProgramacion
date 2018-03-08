
public abstract class Pizza implements Procedimientos
{
	String pizza;
	
	public Pizza orderPizza(Pizza pizza)
	{
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empacar();
		pizza.enviar();
		return pizza;
	}
	
	public void pizzaMaker(Pizza pizza)
	{
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empacar();
		pizza.enviar();
	}
}
