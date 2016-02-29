//Lindsay Swanson
public class FahrenheitToCelcius
{
	public static void main(String[] args)
	{
		//Declare variables
		double f;
		double result;
		
		//Ask for user input
		f = IO.readDouble("Enter a temperature in Fahrenheit ");
		
		//Convert to celcius
		//formula: 5.0(f-32)/9 = c
		result = 5.0 * (f-32) / 9;
		
		//Tell the user
		
		System.out.println("This temperature in Celcius is: " + result); 
	}
}