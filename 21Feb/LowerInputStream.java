import java.io.*;

public class LowerInputStream extends FilterInputStream
{

	protected LowerInputStream(InputStream in) 
	{
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException
	{
		int input = in.read();
		if (input == -1)
		{
			return -1;
		}
		
		else
		{
			return Character.toLowerCase(input);
		}
	}

}
