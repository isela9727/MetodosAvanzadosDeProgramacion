
public class Invoker
{
	Command command;
	
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void buttonExecute()
	{
		command.execute();	
	}
	
	public void buttonUndo()
	{
		command.undo();
	}
	
}
