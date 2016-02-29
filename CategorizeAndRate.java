public class CategorizeAndRate
{
	public static void main(String[] args)
	{
		int x;		
		
		x = IO.readInt("please enter an integer ");
		
		if (x < 0)
		{
			System.out.println("negative");
		}
		else
		{
			if (x == 0)
			{
				System.out.println("zero");
			}
			else
			{
				System.out.println("positive");
			}
		}
		
		if (-100000 > x)
		{
			System.out.println("x is large");
		}
		else
		{
			if (x < 100000)
			{
				System.out.println("x is small");
			}
			else
			{
				if (x > 100000)
				{
					System.out.println("x is large");
				}
			}
		}
	}
}