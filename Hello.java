public class Hello
{
	public static void main(String[] args)
	{
		double user, counter;
		
		user = 1;
		while (user > 0)
		{
			user = IO.readDouble("Enter a number ");
			counter = user;
			while (counter <= user && counter > 0)
			{
				System.out.print("Hello ");
				counter = counter - 1;
			}
			System.out.println();
	 	}
	}
}