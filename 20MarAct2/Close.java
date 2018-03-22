
public class Close implements Command
{
	GarageDoor garageDoor;
	
	public Close(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		garageDoor.close();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.open();
	}

}
