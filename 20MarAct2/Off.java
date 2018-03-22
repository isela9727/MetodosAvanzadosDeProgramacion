
public class Off implements Command
{

	WashingMachine washingMachine;
	
	public Off(WashingMachine washingMachine)
	{
		this.washingMachine = washingMachine;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		washingMachine.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		washingMachine.on();
	}

}
