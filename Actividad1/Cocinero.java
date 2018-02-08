
public class Cocinero extends Persona
{
	public String especialidad, puesto;
	
	public Cocinero(String nombre, int edad, String genero, String especialidad, String puesto) 
	{
		super(nombre, edad, genero);
		this.especialidad = especialidad;
		this.puesto = puesto;
	}
	
	public String getEspecialidad()
	{
		return this.especialidad;
	}
	
	public String getPuesto()
	{
		return this.puesto;
	}
	
	public void setEspecialidad(String especialidad)
	{
		this.especialidad = especialidad;
	}
	
	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}

static HabilidadMotrizManosPies movement = new HabilidadMotrizManosPies();
	
	static Persona cocinero = new Persona("Alejandra", 21, "Femenino");
	
	public static void main (String[] args)
	{
		cocinero.movilidadDisponible(movement);
		Cocinero Alejandra = new Cocinero("Alejandra", 21, "Femenino", "Sushi", "Chef");
		Alejandra.brincar();
		Alejandra.brincarSobreUnPie();
		Alejandra.caminar();
		Alejandra.truenaDedos();		
		Alejandra.respirar();
	}
}
