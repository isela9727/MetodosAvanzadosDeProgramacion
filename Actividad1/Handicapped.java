
public class Handicapped extends Persona
{

	public Handicapped(String nombre, int edad, String genero) 
	{
		super(nombre, edad, genero);
		// TODO Auto-generated constructor stub
	}
	
	static HabilidadMotrizNula movement = new HabilidadMotrizNula();
	
	static Persona handicapped = new Persona("Cristian", 21, "Masculino");
	
	public static void main (String[] args)
	{
		handicapped.movilidadDisponible(movement);
		Handicapped Cristian = new Handicapped("Cristian", 21, "Masculino");
		Cristian.brincar();
		Cristian.brincarSobreUnPie();
		Cristian.caminar();
		Cristian.truenaDedos();		
		Cristian.respirar();
	}
	

}
