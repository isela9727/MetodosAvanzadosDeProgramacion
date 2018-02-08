import java.util.Scanner;

public class Formulario
{
	@SuppressWarnings("resource")
	public static void main (String[] args)
	{
		Campos email = new Email();
		Scanner scannerCorreo = new Scanner(System.in);
		System.out.println("Ingresa tu correo: ");
		String correo = scannerCorreo.next();
		if(email.setValue(correo))
		{
			System.out.println("Email correcto. \n");
		}
		else
		{
			System.out.println("Email incorrecto. El correo debe de terminar de la siguiente manera: xxxxxxxx@cetys.edu.mx \n");
		}
		
		Campos telefono = new Telefono();
		Scanner scannerTelefono = new Scanner(System.in);
		System.out.println("Ingresa tu telefono: ");
		String phone = scannerTelefono.next();
		if (telefono.setValue(phone))
		{
			System.out.println("Telefono correcto. \n");
		}
		else
		{
			System.out.println("Telefono incorrecto. El telefono debe tener 10 digitos\n");
		}
		
		Campos contrasena = new Contrasena();
		Scanner scannerContrasena = new Scanner(System.in);
		System.out.println("Ingresa tu contrasena: ");
		String clave = scannerContrasena.next();
		if(contrasena.setValue(clave))
		{
			System.out.println("Contrasena correcta. \n");
		}
		else
		{
			System.out.println("Contrasena incorrecto. La contrasena debe tener por lo menos un caracter especial: '?', '!', '*'. \n");
		}
		
		Campos nombre = new Nombre();
		Scanner scannerNombre = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String name = scannerNombre.next();
		if(nombre.setValue(name))
		{
			System.out.println("Nombre correcto. \n");
		}
		else
		{
			System.out.println("Nombre incorrecto. El nombre solo debe de estar compuestos por letras. \n");
		}
	
		Campos web = new Web();
		Scanner scannerWeb = new Scanner(System.in);
		System.out.println("Ingresa tu pagina web: ");
		String pagina = scannerWeb.next();
		if (web.setValue(pagina))
		{
			System.out.println("Pagina web correcta. \n");
		}
		else
		{
			System.out.println("Pagina web incorrecta. Una pagina web debe empezar con: 'https://', 'http://', 'www.' y terminar con '.com', o '.gob'. \n");
		}
	}
}
