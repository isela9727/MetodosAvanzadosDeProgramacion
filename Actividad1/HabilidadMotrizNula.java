
public class HabilidadMotrizNula implements MovilidadMotriz
{

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("No se mueve normalmente");
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("No puede caminar");
	}

	@Override
	public void truenaDedos() {
		// TODO Auto-generated method stub
		System.out.println("Se puede tronar los dedos si no le duelen");
	}

	@Override
	public void brincarSobreUnPie() {
		// TODO Auto-generated method stub
		System.out.println("Esta en silla de ruedas, no se puede");
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		System.out.println("Esta en silla de ruedas, no se puede");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Si respira");
	}

}
