
public class Policia extends Persona
{

	public Policia(String nombre, int edad, String genero) 
	{
		super(nombre, edad, genero);
		// TODO Auto-generated constructor stub
	}
	
static HabilidadMotrizManosPies movement = new HabilidadMotrizManosPies();
	
	static Persona policia = new Persona("Carlos", 21, "Masculino");
	
	public static void main (String[] args)
	{
		policia.movilidadDisponible(movement);
		Policia Carlos = new Policia("Carlos", 21, "Masculino");
		Carlos.brincar();
		Carlos.brincarSobreUnPie();
		Carlos.caminar();
		Carlos.truenaDedos();		
		Carlos.respirar();
	}

}
