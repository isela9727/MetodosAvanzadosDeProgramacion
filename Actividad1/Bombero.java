
public class Bombero extends Persona
{

	public Bombero(String nombre, int edad, String genero) 
	{
		super(nombre, edad, genero);
		// TODO Auto-generated constructor stub
	}

static HabilidadMotrizManosPies movement = new HabilidadMotrizManosPies();
	
	static Persona bombero = new Persona("Marcos", 21, "Masculino");
	
	public static void main (String[] args)
	{
		bombero.movilidadDisponible(movement);
		Bombero Marcos = new Bombero("Marcos", 21, "Masculino");
		Marcos.brincar();
		Marcos.brincarSobreUnPie();
		Marcos.caminar();
		Marcos.truenaDedos();		
		Marcos.respirar();
	}
}
