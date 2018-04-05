import java.util.*;

@SuppressWarnings("rawtypes")
public class EnumerationToIterator implements Iterator
{
	Enumeration enumeracion;

	public EnumerationToIterator(Enumeration enumeracion)
	{
		enumeracion = this.enumeracion;
	}	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeracion.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumeracion.nextElement();
	}
	
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
}
