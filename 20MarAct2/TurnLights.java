
public class TurnLights implements Command
{
	GarageDoor garageDoor;
	
	public TurnLights(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.turnLights();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.close();
	}

}
