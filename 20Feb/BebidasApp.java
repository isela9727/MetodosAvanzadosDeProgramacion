
public class BebidasApp 
{
	public static void main (String args[])
	{
		//Debe de poner chico, mediano o grande, en minusculas
		Bebida cafeStarbucks = new Cafe("chico");
		cafeStarbucks = new Expresso(cafeStarbucks);
		System.out.println(cafeStarbucks.costo());
		System.out.println(cafeStarbucks.getDescripcion() + "\n");
		
		Bebida tizanaStarbucks = new Te("mediano");
		tizanaStarbucks = new LecheAlmendra(tizanaStarbucks);
		System.out.println(tizanaStarbucks.costo());
		System.out.println(tizanaStarbucks.getDescripcion());		
	}
}
