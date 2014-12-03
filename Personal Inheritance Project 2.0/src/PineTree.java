public class PineTree extends RealTree
	{
	public PineTree()
	{
		name = "Pine";
		myGreen = (Green) new IsGreen();
	}
	@Override
	public void givesSmell()
	{
	System.out.println(name + " tree gives off the smell of Christmas.");
	}
	@Override
public void dies()
	{
	System.out.println(name + " tree dies because it is a real tree.");
	}
	@Override
	public void holdsOrnaments()
	{
		System.out.println(name + " tree is great to decorate for Christmas.");
	}
	
	}
