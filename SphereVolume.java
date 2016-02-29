//Lindsay Swanson
public class SphereVolume
{
	public static void main(String[] args) 
	{
		//declare variables
		double r;
		double result;
		
		//get value for each variable from user
		r = IO.readDouble("Enter a value for the radius of a sphere > ");
		
		//calculate result
		//vol = 4.0/3.0 Math.PI r(cubed)
		result = 4.0/3.0 * Math.PI * r * r * r;
		
		//tell the user
		System. out.println("The volume of your sphere is: " + result);
	}
}
		