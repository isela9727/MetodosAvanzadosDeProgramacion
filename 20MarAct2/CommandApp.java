
public class CommandApp 
{
	public static void main (String args[])
	{
		Invoker invoker = new Invoker();
		WashingMachine washingMachine = new WashingMachine();
		GarageDoor garageDoor = new GarageDoor();
		ACMachine acMachine = new ACMachine();
		
		invoker.setCommand(new Open(garageDoor));
		invoker.buttonExecute();
		
		invoker.setCommand(new Close(garageDoor));
		invoker.buttonExecute();
		
		invoker.setCommand(new TurnLights(garageDoor));
		invoker.buttonExecute();
		
		invoker.setCommand(new Wash(washingMachine));
		invoker.buttonExecute();
		
		invoker.setCommand(new On(washingMachine));
		invoker.buttonExecute();
		
		invoker.setCommand(new Off(washingMachine));
		invoker.buttonExecute();
		
		invoker.setCommand(new AdjustTemperature(acMachine));
		invoker.buttonExecute();
		
		invoker.setCommand(new OnAC(acMachine));
		invoker.buttonExecute();
		
		invoker.buttonUndo();
	}
}
