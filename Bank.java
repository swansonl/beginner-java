//Lindsay Swanson
//2/3/16

public class Bank
{
	private static final double MAXLOANAMT = 330000.0;
	
	public static double loanCost(double principal, double period, double air)
	{
		double payment;
		double cost;
		double rate;
		double mp;
		
		rate = air / 12;
		mp = Math.pow(1 + rate, period * -1);
		
		payment = (rate /( 1 - mp)) * principal;
		
		cost = period * payment - principal;
		
		if (principal < MAXLOANAMT)
		{
			return cost;
		}
		else
		{
			return 0.0;
		}
	}
	public static void main(String[] args)
	{
		double user;
		double months;
		double ria;
		
		user = IO.readDouble("Enter the amount of your loan ");
		months = IO.readDouble("Enter a value for the period ");
		ria = IO.readDouble("Enter a value for the annual interest rate ");

		System.out.println("The cost of your loan will be " + loanCost(user, months, ria));
	}
}
