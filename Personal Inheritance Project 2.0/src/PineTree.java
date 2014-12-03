public class PineTree extends RealTree
	{
	public PineTree()
	{
		name = "Pine";
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
	}
