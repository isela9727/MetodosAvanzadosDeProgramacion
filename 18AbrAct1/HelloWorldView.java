
public class HelloWorldView 
{
	public static void main (String args[])
	{
		HelloWorldController helloController = new HelloWorldController();
		System.out.println(helloController.helloWorld());
		
		OperacionesController operacion = new OperacionesController();
		System.out.println("El resultado es: " + operacion.suma(5, 6));
		System.out.println("El resultado es: " + operacion.resta(8, 3));
		System.out.println("El resultado es: " + operacion.multiplicacion(6,  8));
		System.out.println("El resultado es: " + operacion.division(9, 3));
	}	
}
