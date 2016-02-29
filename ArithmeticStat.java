//Lindsay Swanson
//1/20/16

public class ArithmeticStat
{
	public static void main(String[] args)
	{
		double user;
		double max;
		double min;
		int counter;
		double accumulator;
		double mean;
		
		user = 0;
		max = 0;
		min = 0;
		accumulator = 0.0;
		counter = 0;
		
		while (user >= 0)
		{
			user = IO.readDouble("Enter a value ");
			if (user > max)
			{
				max = user;
			}
			if (user < min && user >= 0)
			{
				min = user;
			}
			if (user >=0)
			{
				accumulator = accumulator + user;
				counter = counter + 1;
				if (counter == 1)
				{
					min = accumulator;
				}
			}			
		}
		mean = accumulator/counter;
		System.out.println("max: " + max + "; min: " + min + "; mean: " + mean);
	}
}