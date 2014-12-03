public class ColorfulArtificialTree extends ArtificialTree
	{
	public ColorfulArtificialTree()
	{
		name = "Articial colorful";
		myGreen = (Green) new IsNotGreen();
	}
	public void fitswitheverydecor()
		{
		System.out.println(name + " tree can go with every decor in every house.");
		}
	@Override
	public void holdsOrnaments()
	{
		System.out.println(name + " tree is great to decorate for Christmas.");
	}
	}
