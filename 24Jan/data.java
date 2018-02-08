import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import javax.swing.*;

public class data 
{
	JFileChooser jfc;
	String [] datos = {"Tarea de CUDA"};
	
	public static void main(String [] args)
	{
		new data();
	}
	
	public data()
	{
		jfc = new JFileChooser();
		if(jfc.showSaveDialog(jfc) == JFileChooser.APPROVE_OPTION);
		try
		{
			File archivo = new File (jfc.getSelectedFile().getPath());
			FileOutputStream guardarArchivo = new FileOutputStream(archivo);
			ObjectOutputStream guardar = new ObjectOutputStream(guardarArchivo);
			guardar.writeObject(datos);
			guardar.close();
		}
		
		catch (IOException exc)
		{
			JOptionPane.showMessageDialog(null, exc);
		}
		
		try
		{
			if(jfc.showOpenDialog(jfc) == JFileChooser.APPROVE_OPTION)
			{
				File archivo = new File (jfc.getSelectedFile().getPath());
				FileInputStream guardarArchivo = new FileInputStream(archivo);
				ObjectInputStream guardar = new ObjectInputStream(guardarArchivo);
				datos = (String[]) guardar.readObject();
				guardar.close();
			}	
		}
		
		catch (IOException exc)
		{
			JOptionPane.showMessageDialog(null, exc);
		} 
		
		catch (ClassNotFoundException e1) 
		{
			e1.printStackTrace();
		}
	}	
}
