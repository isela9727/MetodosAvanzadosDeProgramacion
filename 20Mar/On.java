
public class On implements Command
{
	WashingMachine washingMachine;
	
	public On(WashingMachine washingMachine)
	{
		this.washingMachine = washingMachine;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		washingMachine.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		washingMachine.off();
	}

}
