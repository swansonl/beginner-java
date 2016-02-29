//Lindsay Swanson
//2/1/16

public class Sums
{
	public static double sumOfWholeNums(double num)
	{
		double sum;
		sum = 0;
		
		while (num > 0)
		{
			sum = sum + num;
			num = num -1;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		double user;
		user = IO.readDouble("Enter a number ");
		if (user >= 1)
		{
		System.out.println("Sum from 1.0 to " + user + " is " + sumOfWholeNums(user));
		}
		System.out.println("All Done");
	}
	
}