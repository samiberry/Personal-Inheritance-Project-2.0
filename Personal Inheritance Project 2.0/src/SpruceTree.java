public class SpruceTree extends RealTree
	{
	public SpruceTree()
	{
	name = "The Spruce";
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
		System.out.println(name + " tree is not a great tree to decorate for Christmas.");
	}
	}