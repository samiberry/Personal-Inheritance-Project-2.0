public class GreenArtificialTree extends ArtificialTree
	{
	public GreenArtificialTree()
	{
		name = "An artificial";
		myGreen = (Green) new IsGreen();
	}
	public void morerealistic()
		{
		System.out.println("Even though it is fake, it is still looks realistic.");
		}
	@Override
	public void holdsOrnaments()
	{
		System.out.println(name + " tree is great to decorate for Christmas.");
	}
	@Override
public void givesSmell()
	{
	
	}
	@Override
public void dies()
	{
	
	}
	@Override
public void reusable()
	{
	System.out.println(name + " tree lives forever.");
	}
	}