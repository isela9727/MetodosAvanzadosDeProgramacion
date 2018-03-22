
public class CommandApp 
{
	public static void main (String args[])
	{
		Invoker invoker = new Invoker();
		WashingMachine washingMachine = new WashingMachine();
		GarageDoor garageDoor = new GarageDoor();
		
		invoker.setCommand(new Open(garageDoor));
		invoker.buttonExecute();
		
		invoker.setCommand(new Close(garageDoor));
		invoker.buttonExecute();
		
		invoker.setCommand(new Wash(washingMachine));
		invoker.buttonExecute();
		
		invoker.buttonUndo();
	}
}
