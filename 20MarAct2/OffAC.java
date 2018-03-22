
public class OffAC implements Command
{
	ACMachine acMachine;
	
	public OffAC(ACMachine acMachine)
	{
		this.acMachine = acMachine;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		acMachine.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		acMachine.on();
	}
}