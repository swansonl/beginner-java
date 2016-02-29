//Lindsay Swanson
//1/25/16

public class MakeAPattern
{
	public static void main(String[] args)
	{
		int user, counter, stop;
		
		user = IO.readInt("Enter a value ");
		stop = user;

		while (user >= 1)
		{
			user = 1;
			while (user <= stop)
			{
				counter = user;
				while (counter <= user && counter > 0)
				{
					System.out.print("*");
					counter = counter - 1;	
				}
				user = user + 1;
				System.out.println();
			}
			user = 0;
		}
	}
}