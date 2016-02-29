//Lindsay Swanson
//1/13/16

public class EasyLoop
{
	public static void main(String[] args)
	{
		//declare variables
		int user;
		
		//put in number to enter loop
		user = 1;	
		//print each number the user enters that's greater than 100
		while (user > 0)
		{
			//get user input
			user = IO.readInt("Enter a number ");
			
			if (user > 100)
				//print if greater than 100
				System.out.println(user);
		}
	}
}