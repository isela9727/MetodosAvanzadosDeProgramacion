
public class Queen extends Character
{
	KnifeBehavior armas = new KnifeBehavior();
	
	public void fight()
	{
		System.out.println("La reina esta con su ");
		armas.useWeapon();
	}
}
