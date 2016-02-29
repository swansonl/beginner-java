public class FruitMap
{
	public static void main( String[] args)
	{
		double user;
		
		user = IO.readDouble("Enter a number");
		
		if (user > 100)
		{
			System.out.println("cherry");
		}
		else
		{
			if (user > -100)
			{
				System.out.println("pear");
			}
			else 
			{
				System.out.println("pineapple");
			}
		}
	}
} 

