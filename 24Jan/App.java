
public class App 
{
	public static void main (String[] args)
	{
		Character rey = new King();
		Character reina = new Queen();
		Character troll = new Troll();
		Character caballero = new Knight();
		
		rey.fight();
		reina.fight();
		troll.fight();
		caballero.fight();
	}
}
