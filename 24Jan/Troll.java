
public class Troll extends Character
{
	AxeBehavior armas = new AxeBehavior();
	
	public void fight()
	{
		System.out.println("El troll esta con su ");
		armas.useWeapon();
	}
}
