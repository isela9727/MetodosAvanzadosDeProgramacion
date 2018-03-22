
public class GarageDoorClose implements Command
{

	public void close()
	{
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Puerta de Garage Cerrada");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Deshacer comando: Puerta de Garage Cerrada");
	}
}