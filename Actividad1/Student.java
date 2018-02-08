
public class Student extends Persona
{
	public int matricula;
	public String carrera;
	
	public Student(String nombre, int edad, String genero, int matricula, String carrera) 
	{
		super(nombre, edad, genero);
		this.matricula = matricula;
		this.carrera = carrera;
	}
	
	public int getMatricula()
	{
		return this.matricula;
	}
	
	public String getCarrera()
	{
		return this.carrera;
	}
	
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	public void setCarrera(String carrera)
	{
		this.carrera = carrera;
	}
	
static HabilidadMotrizManosPies movement = new HabilidadMotrizManosPies();
	
	static Persona estudiante = new Persona("Persona", 21, "Femenino");
	
	public static void main (String[] args)
	{
		estudiante.movilidadDisponible(movement);
		Persona Isela = new Persona("Isela", 21, "Femenino");
		Isela.brincar();
		Isela.brincarSobreUnPie();
		Isela.caminar();
		Isela.truenaDedos();		
		Isela.respirar();
	}
}
