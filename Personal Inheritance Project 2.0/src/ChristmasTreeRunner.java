public class ChristmasTreeRunner 
{

	public static void main(String[] args) 
	{
		ChristmasTree [] christmastree = new ChristmasTree [4];
		christmastree[0] = new PineTree();
		christmastree[1] = new SpruceTree();
		christmastree[2] = new ColorfulArtificialTree();
		christmastree[3] = new GreenArtificialTree();
		
		for(int i = 0; i < christmastree.length; i++)
		{
			christmastree[i].holdsOrnaments();
			christmastree[i].flamable();
		}

	}

}