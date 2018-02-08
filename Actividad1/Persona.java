
public class Persona 
{
	public String nombre, genero;
	public int edad;
	public MovilidadMotriz movement;
	
	public Persona(String nombre, int edad, String genero)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public String getGenero()
	{
		return this.genero;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public void setGenero(String genero)
	{
		this.genero = genero;
	}
	
	public void mover()
	{
		movement.mover();
	}
	
	public void caminar()
	{
		movement.mover();
	}
	
	public void truenaDedos()
	{
		movement.truenaDedos();
	}
	
	public void brincarSobreUnPie()
	{
		movement.brincarSobreUnPie();
	}
	
	public void brincar()
	{
		movement.brincar();
	}
	
	public void respirar()
	{
		movement.respirar();
	}
	
	public void movilidadDisponible(MovilidadMotriz movement)
	{
		this.movement = movement;
	}
}
