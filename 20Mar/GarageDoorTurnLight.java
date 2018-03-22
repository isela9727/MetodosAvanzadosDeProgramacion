
public class GarageDoorTurnLight implements Command
{

	public void turnLights()
	{
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Luces encendidas de la puerta de garage");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Deshacer comando: Luces encendidas de la puerta de garage");
	}

}
