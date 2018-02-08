
public class Knight extends Character
{
	BowAndArrowBehavior armas = new BowAndArrowBehavior();
	
	public void fight()
	{
		System.out.println("El caballero esta con su ");
		armas.useWeapon();
	}
}
