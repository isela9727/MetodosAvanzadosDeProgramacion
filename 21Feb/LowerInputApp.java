import java.io.*;

public class LowerInputApp 
{
	public static void main (String args[])
	{
		int caracter;
		try
		{
			InputStream is = new LowerInputStream(new FileInputStream("/Users/mac/Documents/workspace/MetodosAvanzados/21Feb/21Feb"));
			
			while ((caracter = is.read()) >= 0)
			{
				System.out.print((char) caracter);
			}
			
			is.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
