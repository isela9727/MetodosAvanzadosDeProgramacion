
public class AdjustTemperature implements Command
{
	ACMachine acMachine;
	
	public AdjustTemperature(ACMachine acMachine)
	{
		this.acMachine = acMachine;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		acMachine.adjustTemperature();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		acMachine.off();
	}
}
