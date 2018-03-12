
public class Vegetariana implements Pizza
{
	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		System.out.println("Preparando pizza vegetariana");
	}

	@Override
	public void hornear() {
		// TODO Auto-generated method stub
		System.out.println("Horneando pizza vegetariana");
	}

	@Override
	public void cortar() {
		// TODO Auto-generated method stub
		System.out.println("Cortando pizza vegetariana");
	}

	@Override
	public void empacar() {
		// TODO Auto-generated method stub
		System.out.println("Empacando pizza vegetariana");
	}

	@Override
	public void enviar() {
		// TODO Auto-generated method stub
		System.out.println("Enviando pizza vegetariana\n");
	}	
	
	@Override 
	public void pizzaMaker()
	{
		preparar();
		hornear();
		cortar();
		empacar();
		enviar();
	}
}
