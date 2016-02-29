//Lindsay Swanson
public class EnglishToMetric
{
	public static void main(String[] args)
	{
		//Declare variables
		double pound;
		double result;
		
		//Ask the user for variables
		pound = IO.readDouble("Enter a weight in pounds");
		
		//Convert from pound system to metric
		result = pound / 2.2;
		
		//Give user the result
		//Variable divided by 2.2?
		//conversion rate is 2.2:1
		
		System.out.println("In kilograms, this value is: " + result);
	}
}