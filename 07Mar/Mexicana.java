
public class Mexicana implements Pizza
{

	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		System.out.println("Preparando pizza mexicana");
	}

	@Override
	public void hornear() {
		// TODO Auto-generated method stub
		System.out.println("Horneando pizza mexicana");
	}

	@Override
	public void cortar() {
		// TODO Auto-generated method stub
		System.out.println("Cortando pizza mexicana");
	}

	@Override
	public void empacar() {
		// TODO Auto-generated method stub
		System.out.println("Empacando pizza mexicana");
	}

	@Override
	public void enviar() {
		// TODO Auto-generated method stub
		System.out.println("Enviando pizza mexicana\n");
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
