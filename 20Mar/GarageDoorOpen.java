
public class GarageDoorOpen implements Command
{

	public void open()
	{
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Puerta de Garage Abierta");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Deshacer comando: Puerta de Garage Abierta");
	}

}
