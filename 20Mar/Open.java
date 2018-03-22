
public class Open implements Command
{
	GarageDoor garageDoor;
	
	public Open(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.open();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.close();
	}

}
