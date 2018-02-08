
public class King extends Character
{
	SwordBehavior armas = new SwordBehavior();
	
	public void fight()
	{
		System.out.println("El rey esta con su ");
		armas.useWeapon();
	}
}
