
public class DogAdapter implements Dogs
{
	Cats cat;
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		cat.purr();
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		cat.slash();
	}

}
