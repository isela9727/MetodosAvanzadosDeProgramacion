
public class Wash implements Command
{
	WashingMachine washingMachine;
	
	public Wash(WashingMachine washingMachine)
	{
		this.washingMachine = washingMachine;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		washingMachine.wash();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		washingMachine.off();
	}

}
