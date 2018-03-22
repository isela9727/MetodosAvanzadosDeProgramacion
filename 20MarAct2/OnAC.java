
public class OnAC implements Command
{
	ACMachine acMachine;
	
	public OnAC(ACMachine acMachine)
	{
		this.acMachine = acMachine;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		acMachine.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		acMachine.off();
	}
}

